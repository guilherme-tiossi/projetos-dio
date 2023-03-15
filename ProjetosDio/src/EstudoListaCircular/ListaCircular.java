package EstudoListaCircular;

public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular(){
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;  
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.tamanhoLista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(cauda);
        }else{
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    public void remove(int index){
        if(index >= tamanhoLista){
            throw new IndexOutOfBoundsException("Indíce inválido");
        }
        No<T> noAuxiliar = this.cauda;
        if(index == 0){
            this.cauda = noAuxiliar.getNoProximo();
            this.cabeca.setNoProximo(noAuxiliar);
        }else if (index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        }
        else{
            for(int i = 0; i < index-1;i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
        
    }

    private No<T> getNo(int index){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("A lista está vazia.");
        }

        if(index == 0){
            return this.cauda;
        }

        No<T> noAuxiliar = this.cauda;
        for(int i = 0; (i<index) && (noAuxiliar != null);i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }
        
    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString(){
        No<T> noAuxiliar = this.cauda;
        String strRetorno = "============================\n Lista Circular\n ============================\n";
        for(int i = 0; i < this.size(); i++){
            strRetorno += "[No{conteudo="+noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return strRetorno;
    }
}