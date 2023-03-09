package EstudoFilas;

public class Main {
    public static void main(String[] args){
        Fila<Integer> novaFila = new Fila<Integer>();
        System.out.println(novaFila.isEmpty());
        novaFila.enqueue(1);
        novaFila.enqueue(2);
        novaFila.enqueue(3);
        novaFila.enqueue(4);
        System.out.println(novaFila);
        System.out.println(novaFila.first());
        novaFila.dequeue();
        System.out.println(novaFila);
        System.out.println(novaFila.first());
        System.out.println(novaFila.isEmpty());
    }
}
