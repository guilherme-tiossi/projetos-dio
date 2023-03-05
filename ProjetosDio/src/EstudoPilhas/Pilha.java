package EstudoPilhas;
public class Pilha {
    private No refNoEntradaPilha; //variavel utilizada para manipular o valor do topo da pilha
    
    public Pilha(){
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;//guarda o valor atual do topo
        refNoEntradaPilha = novoNo; //altera o valor do novo topo para novoNo
        refNoEntradaPilha.setRefNo(refAuxiliar); //altera a referencia do novo topo ao valor do 
                                                 //topo anterior
    }

    public No pop(){
        if(!isEmpty()){
            No noPopped = refNoEntradaPilha; //pega o valor do topo da pilha
            refNoEntradaPilha = refNoEntradaPilha.getRefNo(); //altera o valor do topo da pilha
                                                              //para a referencia do antigo topo
            return noPopped;                                
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha; //retorna o valor do nó ao topo da pilha
    }

    public boolean isEmpty(){
        //retorna se pilha está vazia
        if(refNoEntradaPilha == null){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){ //metodo para exibir os valores da pilha no formato String
        String stringRetorno = "------------\n   Pilha\n------------\n";
        
        No noAuxiliar = refNoEntradaPilha; //recebe o valor do primeiro nó da pilha

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