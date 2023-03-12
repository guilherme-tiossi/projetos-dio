package EstudoListaEnceadeada;

public class No<T>{
    private T dado;
    private No<T> refNo = null; 

    public No(T conteudo){
        this.dado = conteudo;
    }

    public No(T conteudo, No<T> proximoNo){
        this.dado = conteudo;
        this.refNo = proximoNo;
    }

    public T getDado(){
        return dado;
    }

    public void setDado(T newDado){
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
        return "Nó{dado = "+dado+"\n    refNo = "+refNo+"}";
    }

}