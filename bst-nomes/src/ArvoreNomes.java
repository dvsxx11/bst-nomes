public class ArvoreNomes {
    No raiz;

    public void inserir(String nome) {
        raiz = inserirRecursivo(raiz, nome);
    }

    private No inserirRecursivo(No atual, String nome) {
        if (atual == null) {
            return new No(nome);
        }

        int comparacao = nome.compareToIgnoreCase(atual.nome);

        if (comparacao < 0) {
            atual.esquerda = inserirRecursivo(atual.esquerda, nome);
        } else if (comparacao > 0) {
            atual.direita = inserirRecursivo(atual.direita, nome);
        }

        return atual;
    }

    public boolean buscar(String nome) {
        return buscarRecursivo(raiz, nome);
    }

    private boolean buscarRecursivo(No atual, String nome) {
        if (atual == null) {
            return false;
        }

        int comparacao = nome.compareToIgnoreCase(atual.nome);

        if (comparacao == 0) {
            return true;
        } else if (comparacao < 0) {
            return buscarRecursivo(atual.esquerda, nome);
        } else {
            return buscarRecursivo(atual.direita, nome);
        }
    }

    public void listarEmOrdem() {
        System.out.println("Nomes em ordem alfabética:");
        listarEmOrdemRecursivo(raiz);
        System.out.println();
    }

    private void listarEmOrdemRecursivo(No no) {
        if (no != null) {
            listarEmOrdemRecursivo(no.esquerda);
            System.out.print(no.nome + " ");
            listarEmOrdemRecursivo(no.direita);
        }
    }

    public void listarReversa() {
        System.out.println("Nomes em ordem decrescente:");
        listarReversaRecursivo(raiz);
        System.out.println();
    }

    private void listarReversaRecursivo(No no) {
        if (no != null) {
            listarReversaRecursivo(no.direita);
            System.out.print(no.nome + " ");
            listarReversaRecursivo(no.esquerda);
        }
    }
}
