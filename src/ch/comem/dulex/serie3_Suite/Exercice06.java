package ch.comem.serie3_Suite;

import java.util.Locale;
import java.util.Scanner;

public class Exercice06 {

    public static void main(String[] args) {
        int BORNE_MIN = 1000;
        int BORNE_MAX = 2000;

        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));

        System.out.println("Ce programme recherche un nombre entre " + BORNE_MIN + " et " + BORNE_MAX + " que vous avez choisi préalablement");

        int nombreMin = BORNE_MIN;
        int nombreMax = BORNE_MAX;
        int nombre;
        int nbEssais = 0;
        boolean trouve;
        boolean nombreEstPlusGrand = false;
        
        do {
            nbEssais++;
            int delta = nombreMax - nombreMin;
            if (delta > 1) {
                nombre = nombreMin + (delta) / 2;
            } else {
                if (nombreEstPlusGrand) {
                    nombre = nombreMin + 1;
                } else {
                    nombre = nombreMax - 1;
                }
            }
            System.out.print("Est-ce que le nombre à trouver est : " + nombre + " ? [o;n]: ");
            trouve = scanner.next().toLowerCase().charAt(0) == 'o';
            if (!trouve) {
                System.out.print("Est-ce que le nombre à trouver est plus grand ? [o;n]: ");
                nombreEstPlusGrand = scanner.next().toLowerCase().charAt(0) == 'o';
                if (nombreEstPlusGrand) {
                    nombreMin = nombre;
                } else {
                    nombreMax = nombre;
                }
            }
        } while (!trouve);
        System.out.println("Hé, hé... ;-) Il m'a fallu " + nbEssais + " essais");
    }
}