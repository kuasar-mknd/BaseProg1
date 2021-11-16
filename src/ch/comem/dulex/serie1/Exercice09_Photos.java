package ch.comem.serie1;

import java.util.Locale;
import java.util.Scanner;

/*

Dans un logiciel de gestion de photos, on désire afficher "x" photos. 
Sachant qu'il y a "y" photos par ligne, combien y aura-t-il de lignes pleines ?
Exemple :
        Combien de photos avez-vous : 427
        Combien de photos par lignes : 11
        Il y aura 38 lignes constituées de 11 photos.

*/

public class Exercice09_Photos {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.print("Combien de photos avez-vous : ");
        int nbPhotos = scanner.nextInt();

        System.out.print("Combien de photos par lignes : ");
        int nbPhotosParLignes = scanner.nextInt();
        
        System.out.println("Il y aura " + nbPhotos/nbPhotosParLignes + 
                " lignes constituées de " + nbPhotosParLignes + " photos");
    }
}