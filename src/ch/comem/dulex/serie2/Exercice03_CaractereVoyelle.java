package ch.comem.serie2;

import java.util.Locale;
import java.util.Scanner;

/*
    Ecrire un programme qui demande un caractère à l’utilisateur et qui vérifie 
    si c’est une voyelle. (Ne pas prendre en compte les caractères accentués). 
*/

public class Exercice03_CaractereVoyelle {

    public static void main(String[] args) {
 
        // Saisie du caractère
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.print("Entrez un caractère: ");
        char c = scanner.next().charAt(0);
        
        // Calcul
        boolean estVoyelle = (c == 'a' || c == 'A' ||
                              c == 'e' || c == 'E' ||
                              c == 'i' || c == 'I' ||
                              c == 'o' || c == 'O' ||
                              c == 'u' || c == 'U' ||
                              c == 'y' || c == 'Y');
        
        // Affichage
        System.out.print("Le caractère '" + c + "' ");
        if (estVoyelle) {
            System.out.print("est");
        } else {
            System.out.print("n'est pas");
        }
        System.out.println(" une voyelle.");
    }
}