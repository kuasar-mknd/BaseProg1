package ch.comem.serie1;

import java.util.Locale;
import java.util.Scanner;

/*

Veuillez compléter le programme précédant pour connaître le nombre de photos sur la dernière ligne.
    Exemple :
                Combien de photos avez-vous : 427
                Combien de photos par lignes : 11
                Il y aura 38 ligne(s) constituées de 11 photos.
                Il y aura 9 photo(s) sur la dernière ligne.

*/

public class Exercice10_PhotosBis {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.print("Combien de photos avez-vous : ");
        int nbPhotos = scanner.nextInt();

        System.out.print("Combien de photos par lignes : ");
        int nbPhotosParLignes = scanner.nextInt();
        
        System.out.println("Il y aura " + nbPhotos/nbPhotosParLignes + 
                " lignes constituées de " + nbPhotosParLignes + " photos");
        
        System.out.println("Il y aura " + nbPhotos%nbPhotosParLignes + 
                " photo(s) sur la dernière ligne");
    }
}