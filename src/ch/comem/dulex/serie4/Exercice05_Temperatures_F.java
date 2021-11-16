package ch.comem.serie4;

import java.util.Locale;
import java.util.Scanner;

public class Exercice05_Temperatures_F {

    public static void main(String[] args) {
        final int NB_TEMPERATURES = 12;
        
        presenteProgramme(NB_TEMPERATURES);
        double[] temperatures = new double[NB_TEMPERATURES];
        initialiseTemperatures(temperatures);
        double[] minMax = rendMinMax(temperatures);
        afficheResultat(minMax);
    }

    private static void presenteProgramme(int nb_temperatures) {
        System.out.println("Ce programme permet de saisir " + nb_temperatures + " températures.");
        System.out.println("Il affichera ensuite l'écart entre la température min. et max.");
    }
    
    private static void initialiseTemperatures(double[] temperatures) {
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Veuillez saisir la " + (i+1) + "e température : ");
            temperatures[i] = scanner.nextDouble();
        }
    }

    private static double[] rendMinMax(double[] temperatures) {
        double[] minMax = new double[2];
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i]<min) {
                min = temperatures[i];
            }
            if (temperatures[i]>max) {
                max = temperatures[i];
            }
        }
        minMax[0] = min;
        minMax[1] = max;
        return minMax;
    }

    private static void afficheResultat(double[] minMax) {
        double diff = minMax[1] - minMax[0];
        System.out.println("L'écart entre la température minimale et maximale est : " + diff);
    }
}