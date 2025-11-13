public class No {
    String nome;
    int contador;
    No esquerda;
    No direita;

    public No(String nome) {
        this.nome = nome;
        contador = 1;
        esquerda = null;
        No direita = null;
    }
}
