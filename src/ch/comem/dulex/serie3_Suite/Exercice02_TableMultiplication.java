package ch.comem.serie3_Suite;

import java.util.Locale;
import java.util.Scanner;

public class Exercice02_TableMultiplication {

    public static void main(String[] args) {
        System.out.println("Ce programme permet à l'utlisateur de saisir un entier,");
        System.out.println("puis d'afficher la table de multiplication de cet entier (de 1 à 12)");
         
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.print("Veuillez saisir un entier : ");
        int entier =scanner.nextInt();
        
        for (int multiplicateur=1; multiplicateur<=12; multiplicateur++) {
            System.out.println(multiplicateur + " x " + entier + " = " + multiplicateur*entier);
        }
    }
}
