// Principal.java
public class Principal {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        int[] ra = {2, 4, 0, 3, 8, 6, 0}; // Dígitos do RA 2403860

        // Inserindo os dígitos na árvore
        for (int valor : ra) {
            arvore.inserir(valor);
        }

        System.out.println("===== ÁRVORE BINÁRIA DO RA 2403860 =====");
        System.out.println("Raiz: " + arvore.raiz.valor);

        System.out.print("Folhas: ");
        arvore.folhas(arvore.raiz);
        System.out.println();

        System.out.println("Altura da Árvore: " + arvore.altura(arvore.raiz));

        System.out.print("Percurso em ordem: ");
        arvore.emOrdem(arvore.raiz);
        System.out.println();
    }
}
