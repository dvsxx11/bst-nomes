public class Main {
    public static void main(String[] args) {
        ArvoreNomes arvore = new ArvoreNomes();

        arvore.inserir("Maria");
        arvore.inserir("Ana");
        arvore.inserir("João");
        arvore.inserir("Pedro");
        arvore.inserir("Bruno");
        arvore.inserir("Carla");
        arvore.inserir("Ana");

        arvore.listarEmOrdem();
        arvore.listarReversa();




    }
}
