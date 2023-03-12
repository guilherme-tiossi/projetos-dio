package EstudoListaEnceadeada;

public class Main {

    public static void main(String[] args){

            ListaEncadeada<String> minhaLista = new ListaEncadeada<String>();
            System.out.println(minhaLista.isEmpty());
            minhaLista.add("Um");
            minhaLista.add("Dois");
            minhaLista.add("Trẽs");
            System.out.println(minhaLista.size());
            System.out.println(minhaLista);
            minhaLista.remove(2);
            System.out.println(minhaLista);
            System.out.println(minhaLista.size());
    }
    
}
