package ch.comem.serie4;

import java.util.Locale;
import java.util.Scanner;

public class Exercice05_Temperatures {

    public static void main(String[] args) {
        final int NB_TEMPERATURES = 12;
        
        System.out.println("Ce programme permet de saisir " + NB_TEMPERATURES + " températures.");
        System.out.println("Il affichera ensuite l'écart entre la température min. et max.");
        
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        double[] temperatures = new double[NB_TEMPERATURES];
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Veuillez saisir la " + (i+1) + "e température : ");
            temperatures[i] = scanner.nextDouble();
            if (temperatures[i]<min) {
                min = temperatures[i];
            }
            if (temperatures[i]>max) {
                max = temperatures[i];
            }
        }
        double diff = max - min;
        System.out.println("L'écart entre la température minimale et maximale est : " + diff);
    }
}