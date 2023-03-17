package EqualsHashCode;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Hyundai"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Ford"));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(listaCarros.get(0).equals(listaCarros.get(3)));
        System.out.println(listaCarros.get(0).equals(listaCarros.get(2)));
    }
    
}
