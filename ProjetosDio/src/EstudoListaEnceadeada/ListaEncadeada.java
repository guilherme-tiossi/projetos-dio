package EstudoListaEnceadeada;

public class ListaEncadeada<T> {
    
    No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    public void add(T conteudo){ //função que adiciona um nó para a lista
        No<T> novoNo = new No<T>(conteudo); //pega o conteúdo e cria um nó com base nele
        if(this.isEmpty()){
            this.referenciaEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size()-1; i++){ //laço for que vai até o fim da lista
            noAuxiliar = noAuxiliar.getRefNo(); //e armazena o valor dos nós na noAuxiliar.
        }
        noAuxiliar.setRefNo(novoNo);
    }

    public int size(){ //função que indica o tamanho da Lista Encadeada
        int tamanhoLista = 0;
        No<T> referenciaAuxiliar = referenciaEntrada;
        while(true){
            if(this.isEmpty() == false){
                tamanhoLista++; 
                if(referenciaAuxiliar.getRefNo() != null){ //se a referencia do nó não for nula
                    referenciaAuxiliar = referenciaAuxiliar.getRefNo(); //a refAuxiliar passa para o próximo nó da lista
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }

    public T get(int index){
        return getNo(index).getDado();
    }

    public T remove(int index){
        validaIndice(index);
        No<T> noPivot = getNo(index);
        if(index == 0){
            referenciaEntrada = noPivot.getRefNo(); //caso o index for zero, a referencia de entrada passa a ser o próximo valor
            return noPivot.getDado();
        }
        No<T> noAnterior = getNo(index -1);
        noAnterior.setRefNo(noPivot.getRefNo()); //coloca a referência do nó anterior ao noPivot como
                                                 // sendo a referencia do nó Pivot, excluindo assim o 
                                                 //nó Pivot da lista.
        return noPivot.getDado();
    }

    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        for(int i = 0; i <= index; i++){ //laço for que vai até o fim da lista
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getRefNo();
        }
        return noRetorno;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    public void validaIndice(int index){
        if(index >= size()){
            throw new IndexOutOfBoundsException("Indíce inválido.");
        }
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getDado() +"}]--->";
            noAuxiliar = noAuxiliar.getRefNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
