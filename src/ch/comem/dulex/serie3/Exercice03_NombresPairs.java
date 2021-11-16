package ch.comem.serie3;

import java.util.Locale;
import java.util.Scanner;

public class Exercice03_NombresPairs {

    public static void main(String[] args) {
        
        // Saisie de la limite
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        int limite;
        boolean estPlusPetitOuEgalADeux;
        do {
            System.out.print("Entrez la limite supérieure ( >=2 ) des nombres pairs à afficher: ");
            limite = scanner.nextInt();
            estPlusPetitOuEgalADeux = (limite<=2);
            if (estPlusPetitOuEgalADeux) {
              System.out.println("Le nombre n'est pas plus grand ou égal à 2");
            }
        } while (estPlusPetitOuEgalADeux);
        
        // Affichage des résultats
        System.out.println("Liste des nombre pairs entre 1 et " + limite);
        System.out.println("********************************************");
        for(int nb=2; nb<=limite; nb+=2){
            System.out.println(nb);
        }
    }
}
