package ch.comem.serie3;

import java.util.Locale;
import java.util.Scanner;
/**
 * Ecrire un algorithme qui demande un nombre entier de départ, et qui
 * calcule la somme des entiers à partir de 1 jusqu’à ce nombre. Par exemple, si
 * l'on entre 5, le programme doit calculer : 1 + 2 + 3 + 4 + 5 = 15
 */
public class Exercice07_Somme1aN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.print("Entrez un nombre eniter : ");
        int limiteSup = scanner.nextInt();
        //au départ la somme est nul
        int somme = 0;
        //boucle de parcours des nombres (on ajoute ces nombres à la somme)
        for(int nb=1; nb<=limiteSup; nb++){
            somme = somme + nb;
        }
        System.out.print("La somme des nombres entiers entre 1 et " +
                limiteSup + " vaut: ");
        System.out.println(somme);
        
        System.out.print("La somme des nombres entiers (vive les math ;-) entre 1 et " +
                limiteSup + " vaut: ");
        System.out.println(limiteSup*(limiteSup+1) /2);
    }
}