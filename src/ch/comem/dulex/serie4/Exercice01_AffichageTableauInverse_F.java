package ch.comem.serie4;

public class Exercice01_AffichageTableauInverse_F {

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        afficheTableauOrdreInverse(tab);
    }

    private static void afficheTableauOrdreInverse(int[] tab) {
        if (tab != null && tab.length > 0) {
            System.out.print("{");
            for (int i = tab.length - 1; i > 0; i--) {
                System.out.print(tab[i] + ",");
            }
            System.out.print(tab[0]);
            System.out.println("}");
        }
    }
}