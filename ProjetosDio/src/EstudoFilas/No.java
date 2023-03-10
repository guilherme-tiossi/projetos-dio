package EstudoFilas;

public class No<T> {
    private T dado;
    private No<T> refNo;

    public No(T obj){
        this.dado = obj;
    }

    public T getObject(){
        return dado;
    }

    public void setObject(T newDado){
        this.dado = newDado;
    }

    public No<T> getRefNo(){
        return refNo;
    }

    public void setRefNo(No<T> newRefNo){
        this.refNo = newRefNo;
    }

    @Override
    public String toString(){
        return "No{dado=" + dado + '}';
    }
}