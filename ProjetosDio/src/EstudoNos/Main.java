package EstudoNos;
public class Main {
    public static void main(String[] args){
        No<Integer> no1 = new No("Conteúdo no1");
        No<String> no2 = new No("Conteúdo no2");
        no1.setProximoNo(no2);
        No<String> no3 = new No("Conteúdo no3");
        no2.setProximoNo(no3);
        No<String> no4 = new No("Conteúdo no4");
        no3.setProximoNo(no4);
        System.out.println(no3);
    }
}