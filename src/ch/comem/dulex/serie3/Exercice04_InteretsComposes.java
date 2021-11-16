package ch.comem.serie3;

import java.util.Locale;
import java.util.Scanner;

public class Exercice04_InteretsComposes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        
        // Saisie du capital (>0)
        double capital;
        boolean estPlusPetitOuEgalAZero;
        do {
            System.out.print("Entrez le capital ( >0 ) de départ : ");
            capital = scanner.nextDouble();
            estPlusPetitOuEgalAZero = (capital<=0);
            if (estPlusPetitOuEgalAZero) {
              System.out.println("Le capital n'est pas correct");
            }
        } while (estPlusPetitOuEgalAZero);
        
        // Saisie du taux d'intéret (>0) 
        double tauxInteret;
        do {
            System.out.print("Entrez le taux d'intérêt en % : ");
            tauxInteret = scanner.nextDouble();
            estPlusPetitOuEgalAZero = (tauxInteret<=0);
            if (estPlusPetitOuEgalAZero) {
              System.out.println("Le taux n'est pas correct");
            }
        } while (estPlusPetitOuEgalAZero);
        
        // Saisie du nombre de périodes (>0)
        int nbPeriodes;
        do {
            System.out.print("Entrez le nombre de périodes : ");
            nbPeriodes = scanner.nextInt();
            estPlusPetitOuEgalAZero = (nbPeriodes<=0);
            if (estPlusPetitOuEgalAZero) {
              System.out.println("Le nombre de périodes n'est pas correct");
            }
        } while (estPlusPetitOuEgalAZero);
       
        // Calculs
        double capitalFinal = capital;
        //calcul les intérêts de chaque période
        for (int periode = 0; periode < nbPeriodes; periode++){
            capitalFinal = capitalFinal * (1 + tauxInteret/100 );
        }
        final double PRECISION = 0.05;
        double capitalFinalArrondi = Math.round(capitalFinal/PRECISION)*PRECISION;
        
        // Affichage du résultat
        System.out.print("Un somme de " + capital);
        System.out.print(" placée pendant " + nbPeriodes + " période(s)");
        System.out.print(" avec un taux d'intérêt de " + tauxInteret + "%");
        System.out.println(" génère un capital final de " + capitalFinalArrondi);
    }
}