package main.ExercicioTelevisao;
import java.util.Scanner;

public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    Scanner sc = new Scanner(System.in);

    public void exibirInformacoes(){
        System.out.println("Ligada: " + this.ligada);
        System.out.println("Canal: " + this.canal);
        System.out.println("Volume: " + this.volume);
        System.out.println("A televisão está " + this.ligada);
        System.out.println("A televisão está no volume " + this.volume);
        System.out.println("A televisão está no canal " + this.canal);
        System.out.println("Digite + para aumentar o volume e - para abaixar o volume");
        System.out.println("Digite > para aumentar o canal e < para abaixar o canal");
        System.out.println("    (Você pode também digitar o número do canal desejado para ir até ele)");
        System.out.println("Digite enter para desligar/ligar a televisão");
    }

    public void lerComandos(){
        String botao = sc.nextLine();
        if(Integer.parseInt(botao) == Integer){

        }
        
        System.out.println(botao);
    }

    public String ligarDesligar(){
        if(ligada == false){
            ligada = true;
            return "ligada";
        }
        else{
            ligada = false;
            return "desligada";   
        }
    }

    public void mudarVolume(char bt){
        if(bt == '+'){
            volume++;
        }
        else{
            volume--;
        }
    }

    public void mudarCanal(char bt){
        if(bt == '>'){
            canal++;
        }
        else if(bt == '<'){
            canal--;
        }
        else{
            canal = bt;
        }
    }
}
