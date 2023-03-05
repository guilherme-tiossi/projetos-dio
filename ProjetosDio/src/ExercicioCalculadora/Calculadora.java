package ExercicioCalculadora;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma operação (+, -, * ou / apenas)");
        char operacao = sc.next().charAt(0);
        if(operacao != '+' && operacao != '-' && operacao != '*' && operacao != '/'){
            System.out.println("Operação inválida");
        }
        else{
            System.out.print("Número um: ");
            int notaUm = sc.nextInt();
            System.out.print("Número dois: ");
            int notaDois = sc.nextInt();
            System.out.println(calcula(notaUm, notaDois, operacao));
            sc.close();
        }
    }

    public static int calcula(int a, int b, char op){
        int c;
        switch(op){
            case '+':
                c = a + b;
            break;
            case '-':
                c = a - b;
            break;
            case '*':
                c = a * b;
            break;
            case '/':
                c = a / b;
            break;
            default:
                c = 0;
            break;
        }
        return c;
    }
    }
