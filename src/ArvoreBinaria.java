// ArvoreBinaria.java
public class ArvoreBinaria {
    no raiz;

    // Inserção padrão de árvore binária de busca (BST)
    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private no inserirRec(no atual, int valor) {
        if (atual == null) {
            return new no(valor);
        }

        if (valor < atual.valor) {
            atual.esquerda = inserirRec(atual.esquerda, valor);
        } else {
            atual.direita = inserirRec(atual.direita, valor);
        }

        return atual;
    }

    // Percurso em ordem
    public void emOrdem(no no) {
        if (no != null) {
            emOrdem(no.esquerda);
            System.out.print(no.valor + " ");
            emOrdem(no.direita);
        }
    }

    // Altura da árvore
    public int altura(no no) {
        if (no == null) return 0;
        int esquerda = altura(no.esquerda);
        int direita = altura(no.direita);
        return Math.max(esquerda, direita) + 1;
    }

    // Mostra folhas
    public void folhas(no no) {
        if (no != null) {
            if (no.esquerda == null && no.direita == null) {
                System.out.print(no.valor + " ");
            }
            folhas(no.esquerda);
            folhas(no.direita);
        }
    }
}
