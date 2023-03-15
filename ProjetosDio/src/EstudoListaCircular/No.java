package EstudoListaCircular;

public class No<T> {
    private T conteudo;
    private No<T> noProximo;
    private No<T> noZero;
    
    public No(T conteudo){
        this.noProximo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
    public No<T> getNoProximo() {
        return noProximo;
    }
    public void setNoProximo(No<T> noAnterior) {
        this.noProximo = noAnterior;
    }
    public No<T> getNoZero() {
        return noZero;
    }
    public void setNoZero(No<T> noZero) {
        this.noZero = noZero;
    }

    @Override
    public String toString(){
        return "No{"+conteudo+"}";
    }
}
