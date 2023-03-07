package EstudoFilas;

public class Fila {
    private No refNoEntradaFila; //variavel utilizada para armazenar a referência do nó do início da fila

    public Fila(){
        this.refNoEntradaFila = null;
    }

    public No first(){ //metodo utilizado para recuperar o valor do primeir nó da fila
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){ //enquanto a referência do primeiroNo não for null:
                    primeiroNo = primeiroNo.getRefNo();//primeiroNo passará para o próximo nó da fila
                }else{
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public void enqueue(No novoNo){//mmétodo utilizado para adicionar um novo nó à fila
        novoNo.setRefNo(refNoEntradaFila); //coloca a referencia do novo nó como o nó posterior a ele
        refNoEntradaFila = novoNo; //adiciona o novoNo como último da fila
    }

    public No dequeue(){//metodo para retirar o primeiro nó da fila
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){//enquanto a referência do primeiroNo não for null:
                    noAuxiliar = primeiroNo;//guarda o valor do nó antes de passar para o próximo
                    primeiroNo = primeiroNo.getRefNo();//primeiroNo passará para o próximo nó da fila
                }else{//quando chegar no primeiro nó
                    noAuxiliar.setRefNo(null);//altera o penúltimo nó para último nó
                    break;
                }
            }
            return primeiroNo;
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
        
        No noAuxiliar = refNoEntradaFila; //recebe o valor do primeiro nó da pilha

        while(true){
            if(noAuxiliar != null){
                stringRetorno += "No{" + "dado=" + noAuxiliar.getDado() + "}\n";
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
