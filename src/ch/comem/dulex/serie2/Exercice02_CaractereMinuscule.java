package ch.comem.serie2;

import java.util.Locale;
import java.util.Scanner;

/*
    Ecrire un programme qui demande un caractère à l’utilisateur et qui vérifie 
    si c’est une lettre minuscule (ne pas prendre en compte les caractères accentués). 
*/

public class Exercice02_CaractereMinuscule {

    public static void main(String[] args) {
        
        // Saisie du caractère
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.print("Entrez un caractère: ");
        char c = scanner.next().charAt(0);
        
        // Calcul
        boolean estMinuscule = c >='a' && c <='z';
 
        // Affichage du résultat
        System.out.print("Le caractère '" + c + "' ");
        if (estMinuscule) {
            System.out.print("est");
        } else {
            System.out.print("n'est pas");
        }
        System.out.println(" une lettre minuscule.");
    }
}