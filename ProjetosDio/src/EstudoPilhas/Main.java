package EstudoPilhas;
public class Main {
    public static void main(String[] args){
        Pilha novaPilha = new Pilha();
        novaPilha.push(new No(1));
        novaPilha.push(new No(2));
        novaPilha.push(new No(3));
        novaPilha.push(new No(4));
        System.out.println(novaPilha);
        System.out.println(novaPilha.pop());
        System.out.println(novaPilha);

    }   
}