package EstudoLDuplamenteEncadeada;

public class ListaDpEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDpEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }
    
    public void add(T conteudo){
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(T conteudo, int index){
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        NoDuplo<T> noAuxiliar = getNo(index); //noAuxiliar recebe o valor do nó index
        novoNo.setNoProximo(noAuxiliar); // novoNo é colocado atrás do nó index

        if(novoNo.getNoProximo() != null){ //se noAuxiliar não for o último nó(nulo) da lista
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio()); //noPrevio do novoNó recebe o noPrevio do noAuxiliar
            novoNo.getNoProximo().setNoPrevio(novoNo); // autoexplicativo
        }else{ //se noAuxiliar for o último nó(nulo) da lista
            novoNo.setNoPrevio(ultimoNo); //autoexplicativo
            ultimoNo = novoNo; //novoNo será o último nó
        }
        if(index == 0){
            primeiroNo = novoNo;
        }else{
            novoNo.getNoPrevio().setNoProximo(novoNo); //coloca o nó proximo do nó prévio do novoNo como novoNo 
        }
        this.tamanhoLista++;
    }

    public void remove(int index){
        if(index == 0){
            primeiroNo = primeiroNo.getNoProximo();
            if(primeiroNo != null){
                primeiroNo.setNoPrevio(null);
            }
        }else{
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            }else{

            }
        }
        this.tamanhoLista--;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; (i<index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString(){
        String strRetorno;
        NoDuplo<T> noAuxiliar = primeiroNo;
        strRetorno = "============================\n Lista Duplamente Encadeada\n ============================\n";
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo = "+noAuxiliar.getConteudo()+"}]-->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return strRetorno;
    }
}
