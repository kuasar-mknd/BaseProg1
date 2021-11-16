package ch.comem.serie2;

import java.util.Locale;
import java.util.Scanner;

/*
    Ecrire un programme qui demande un nombre à l’utilisateur, et l’informe 
    ensuite si ce nombre est négatif (<0) ou positif (>=0). 
*/

public class Exercice04_PositifNegatif {

    public static void main(String[] args) {
 
        // Saisie du nombre
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.print("Entrez un nombre: ");
        double nb = scanner.nextDouble();
        
        // Calcul
        boolean estPositif = nb>=0;
 
        // Affichage du résultat
        System.out.print("Le nombre " + nb + " est ");
        if (estPositif) {
            System.out.println("positif");
        } else {
            System.out.println("négatif");
        }
    }
}