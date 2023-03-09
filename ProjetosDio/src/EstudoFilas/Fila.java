package EstudoFilas;

public class Fila<T> {
    private No<T> refNoEntradaFila; //variavel utilizada para armazenar a referência do nó do início da fila

    public Fila(){
        this.refNoEntradaFila = null;
    }

    public T first(){ //metodo utilizado para recuperar o valor do primeir nó da fila
        if(!this.isEmpty()){
            No<T> primeiroNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){ //enquanto a referência do primeiroNo não for null:
                    primeiroNo = primeiroNo.getRefNo();//primeiroNo passará para o próximo nó da fila
                }else{
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public void enqueue(T obj){//mmétodo utilizado para adicionar um novo nó à fila
        No<T> novoNo = new No<T>(obj);
        novoNo.setRefNo(refNoEntradaFila); //coloca a referencia do novo nó como o nó posterior a ele
        refNoEntradaFila = novoNo; //adiciona o novoNo como último da fila
    }

    public T dequeue(){//metodo para retirar o primeiro nó da fila
        if(!this.isEmpty()){
            No<T> primeiroNo = refNoEntradaFila;
            No<T> noAuxiliar = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){//enquanto a referência do primeiroNo não for null:
                    noAuxiliar = primeiroNo;//guarda o valor do nó antes de passar para o próximo
                    primeiroNo = primeiroNo.getRefNo();//primeiroNo passará para o próximo nó da fila
                }else{//quando chegar no primeiro nó
                    noAuxiliar.setRefNo(null);//altera o penúltimo nó para último nó
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        if(refNoEntradaFila == null){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){ //metodo para exibir os valores da pilha no formato String
        String stringRetorno = "------------\n   Fila\n------------\n";
        
        No<T> noAuxiliar = refNoEntradaFila; //recebe o valor do primeiro nó da pilha

        while(true){
            if(noAuxiliar != null){
                stringRetorno += "No{" + "dado=" + noAuxiliar.getObject() + "}\n";
                noAuxiliar = noAuxiliar.getRefNo();//recebe o valor do próximo nó da pilha
                                                   //enquanto existir próximo nó
            }else{
                break;
            }
        }
        stringRetorno += "------------";
        return stringRetorno;
    }
}
