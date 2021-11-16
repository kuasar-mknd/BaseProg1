package ch.comem.serie2;

import java.util.Locale;
import java.util.Scanner;

/*
    Ecrire un programme qui demande un nombre à l’utilisateur, et l’informe 
    ensuite si ce nombre est positif, négatif ou nul.
*/

public class Exercice05_PositifNegatifNul {

    public static void main(String[] args) {
        
        // Saisie de la valeur
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.print("Entrez un nombre: ");
        double nb = scanner.nextDouble();
        
        // Calculs
        boolean estStrictementPositif = nb > 0;
        boolean estStrictementNegatif = nb < 0; // ou !(nb > 0)
        
        // Affichage des résultats
        System.out.print("Le nombre " + nb + " est ");
        if (estStrictementPositif) {
            System.out.println("positif");
        } else if (estStrictementNegatif) {
            System.out.println("négatif");
        } else {
            System.out.println("nul");
        }
    }
}