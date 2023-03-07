package EstudoFilas;

public class No {
    private int dado;
    private No refNo;

    public No(int dado){
        this.dado = dado;
    }

    public int getDado(){
        return dado;
    }

    public void setDado(int newDado){
        this.dado = newDado;
    }

    public No getRefNo(){
        return refNo;
    }

    public void setRefNo(No newRefNo){
        this.refNo = newRefNo;
    }

    @Override
    public String toString(){
        return "No{" + "dado=" + dado + '}';
    }
}