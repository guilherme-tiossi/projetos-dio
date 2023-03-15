package EstudoListaCircular;

public class Main {
    public static void main(String[] args){
        ListaCircular<String> minhaLista = new ListaCircular<>();
        minhaLista.add("um");
        minhaLista.add("dois");
        minhaLista.add("três");
        System.out.println(minhaLista.size());
        System.out.println(minhaLista);
        minhaLista.remove(2);
        minhaLista.get(2);
        minhaLista.add("asuhashuashuashuahs");
        System.out.println(minhaLista);
    }
}
