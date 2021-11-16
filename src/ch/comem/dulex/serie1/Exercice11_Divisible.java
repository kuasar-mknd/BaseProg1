package ch.comem.serie1;

import java.util.Locale;
import java.util.Scanner;

/*

Veuillez écrire un programme permettant de savoir si un nombre est divisible par un autre.
    Exemple 1 :
        Veuillez saisir un nombre : 13
        Veuillez saisir un diviseur : 7
        13 est-il divisible par 7 ? : false
    
    Exemple 2 :
        Veuillez saisir un nombre : 14
        Veuillez saisir un diviseur : 7
        14 est-il divisible par 7 ? : true

*/

public class Exercice11_Divisible {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.print("Veuillez saisir un nombre : ");
        int nombre = scanner.nextInt();

        System.out.print("Veuillez saisir un diviseur : ");
        int diviseur = scanner.nextInt();
        
        System.out.println(nombre + " est-il divisible par " + diviseur + 
                " ? " + (nombre%diviseur==0));
    }
}