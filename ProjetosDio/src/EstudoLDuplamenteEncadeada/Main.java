package EstudoLDuplamenteEncadeada;

public class Main{
    public static void main(String[] args){
        ListaDpEncadeada<String> minhaLista = new ListaDpEncadeada<String>();
        minhaLista.add("um");
        minhaLista.add("dois");
        minhaLista.add("três");
        minhaLista.add("quatro");
        minhaLista.add("cinco");
        minhaLista.add("seis");
        System.out.println(minhaLista.size());
        minhaLista.add("três e meio",3);
        System.out.println(minhaLista);
        minhaLista.remove(5);
        System.out.println(minhaLista.size());
        System.out.println(minhaLista);
    }
}