package ch.comem.serie3_Suite;

import java.util.Locale;
import java.util.Scanner;

public class Exercice02_TableMultiplication_F {

    public static void main(String[] args) {
        presenteProgramme();
        afficheLivret(rendEntierSaisi("Veuillez saisir un entier : "));
    }
    
    public static void presenteProgramme() {
        System.out.println("Ce programme permet à l'utlisateur de saisir un entier,");
        System.out.println("puis d'afficher la table de multiplication de cet entier (de 1 à 12)");
    }
    
    public static int rendEntierSaisi(String message) {
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.print(message);
        return scanner.nextInt();
    }
    
    public static void afficheLivret(int entier) {
        
        for (int multiplicateur=1; multiplicateur<=12; multiplicateur++) {
            System.out.println(multiplicateur + " x " + entier + " = " + multiplicateur*entier);
        }
    }
}