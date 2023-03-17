package EstudoArvoreBinaria;

public class Main {
    public static void main(String[] args){
        ArvoreBin<Obj> minhaArvore = new ArvoreBin<>();
        minhaArvore.inserir(new Obj(3));
        minhaArvore.inserir(new Obj(53));
        minhaArvore.inserir(new Obj(43));
        minhaArvore.inserir(new Obj(11));
        minhaArvore.inserir(new Obj(42));
        minhaArvore.inserir(new Obj(72));
        minhaArvore.inserir(new Obj(5));
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();
        minhaArvore.exibirInOrdem();
    }    
}
