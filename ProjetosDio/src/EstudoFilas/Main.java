package EstudoFilas;

public class Main {
    public static void main(String[] args){
        Fila novaFila = new Fila();
        novaFila.enqueue(new No(1));
        novaFila.enqueue(new No(2));
        novaFila.enqueue(new No(3));
        novaFila.enqueue(new No(4));
        System.out.println(novaFila);
        System.out.println(novaFila.first());
        novaFila.dequeue();
        System.out.println(novaFila);
        System.out.println(novaFila.first());
    }
}
