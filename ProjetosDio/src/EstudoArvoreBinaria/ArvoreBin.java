package EstudoArvoreBinaria;

public class ArvoreBin<T extends Comparable<T>> {
    public NoBin<T> raiz;

    public ArvoreBin(){
        this.raiz = null;
    }

    public void inserir(T conteudo){
        NoBin<T> novoNo = new NoBin<T>(conteudo);
        this.raiz = inserir(raiz, novoNo); //a raiz será o return do método privado inserir
    }

    private NoBin<T> inserir(NoBin<T> atual, NoBin<T> novoNo){
        if(atual == null){ //se não conteudo
            return novoNo; //a raiz será o novo conteúdo inserido
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){ //se o novoNo for menor que o atual
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo)); //novoNo é o noEss
        }else{
            atual.setNoDir(inserir(atual.getNoDir(), novoNo)); //novoNo é o noDir
        }
        return atual;
    }

    public void exibirInOrdem(){
        System.out.print("Exibindo in-ordem: ");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(NoBin<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    public void exibirPosOrdem(){
        System.out.print("Exibindo pós-ordem: ");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(NoBin<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    public void exibirPreOrdem(){
        System.out.print("Exibindo pré-ordem: ");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(NoBin<T> atual){
        if(atual != null){
            System.out.print(atual.getConteudo() + ", ");
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
        }
    }

    public void remover(T conteudoExclusao){
        try{
            NoBin<T> atual = this.raiz;
            NoBin<T> pai = null;
            NoBin<T> filho = null;
            NoBin<T> temp = null;

            //essas linhas de código abaixo são um "caminho" para o atual chegar até o nó que contenha o conteudoExclusao
            while(atual!= null && !atual.getConteudo().equals(conteudoExclusao)){ //enquanto o conteúdo do nó tual não for igual ao conteudoExclusao
                pai = atual;
                if(conteudoExclusao.compareTo(atual.getConteudo()) < 0){ //se o conteudoExclusao for menor que o conteudo atual
                    atual = atual.getNoEsq(); //caminha para o NoEsq
                }else{ //caso contrário
                    atual = atual.getNoDir(); //caminha para o noDir
                }
            }
            //quando o atual for igual ao conteudoExclusao ou igual a nulo

            if(atual == null){
                System.out.println("Conteúdo não encontrado.");
            }
            
            if(pai == null){ //se o atual for a raiz
                if(atual.getNoDir() == null){
                    this.raiz = atual.getNoEsq();
                }else if(atual.getNoEsq() == null){
                    this.raiz = atual.getNoDir();
                }else{
                    for(temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoEsq()
                    ){
                        if(filho != atual.getNoEsq()){
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }
            }else if(atual.getNoDir() == null){ 
                if(pai.getNoEsq() == atual){ //se a referência à esquerda do pai é igual ao conteudoExclusao
                    pai.setNoEsq(atual.getNoEsq()); //exclui a referencia do conteudoExclusao
                }else{
                    pai.setNoDir(atual.getNoEsq());
                }
            }else if(atual.getNoEsq() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoDir());
                }else{
                    pai.setNoDir(atual.getNoDir());
                }
            }else{
                for(
                    temp = atual, filho = atual.getNoEsq();
                    filho.getNoDir() != null;
                    temp = filho, filho = filho.getNoDir()
                ){
                    if(filho != atual.getNoEsq()){
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if(pai.getNoEsq() == atual){
                        pai.setNoEsq(filho);
                    }
                    else{
                        pai.setNoDir(filho);
                    }
                }
            }
        }catch(NullPointerException erro){
            System.out.println("Conteúdo não encontrado.");
        }
    }
}
