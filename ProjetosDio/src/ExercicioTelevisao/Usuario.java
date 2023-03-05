package ExercicioTelevisao;

public class Usuario {
    public static void main(String[] args){
        SmartTv televisao = new SmartTv();
        while(true){
        televisao.exibirInformacoes();
        televisao.lerComandos();
        }
    }
}
