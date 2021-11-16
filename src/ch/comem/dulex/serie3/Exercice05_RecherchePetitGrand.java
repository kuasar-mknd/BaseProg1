package ch.comem.serie3;

import java.util.Locale;
import java.util.Scanner;
/**
 * Calculer et afficher le plus petit et le plus grand nombre d'une liste de 10 nombres entiers.
 */
public class Exercice05_RecherchePetitGrand {

    public static void main(String[] args) {
        final int NB_ELEMENTS = 10;
        
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        // Cas particulier pour le premier membre du flot.
        // En effet on ne peut pas le comparer avec "petit" et "grand".
        System.out.print("Entrez le 1er nombre : ");
        int nb = scanner.nextInt();
        // On initialise donc "petit" et "grand" avec "nb"
        int petit = nb;
        int grand = nb;
        // On compare les éléments du reste du flot avec "petit" et "grand".
        for (int i=2; i<NB_ELEMENTS; i++){
            System.out.print("Entrez le " + (i+1) + "e nombre:");
            nb = scanner.nextInt();
            if (nb < petit){
               petit = nb;
            } else if (nb > grand) {
                grand = nb;
            }
        }
        System.out.println("Le plus grand nombre est: " + grand);
        System.out.println("Le plus petit nombre est: " + petit);
    }
}