package ch.comem.serie3_Suite;

import java.util.Locale;
import java.util.Scanner;

public class Exercice05_Dahu {

    public static void main(String[] args) {
        System.out.println("Ce programme génère un nombre entre 1000 et 2000 et l'utilisateur doit le trouver");
        final int BORNE_MIN = 1000;
        final int BORNE_MAX = 2000;

        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));

        int plageValeurs = BORNE_MAX - BORNE_MIN + 1;
        final int NOMBRE_A_TROUVER = BORNE_MIN + ((int) (Math.random() * plageValeurs));

        int nbEssais = 0;

        int nombre;

        do {
            System.out.print("Saisi un entier entre " + BORNE_MIN + " et " + BORNE_MAX + " : ");
            nombre = scanner.nextInt();
            if (nombre < NOMBRE_A_TROUVER) {
                System.out.println("Le nombre à trouver est plus grand");
            } else if (nombre > NOMBRE_A_TROUVER) {
                System.out.println("Le nombre à trouver est plus petit");
            }
            nbEssais++;
        } while (nombre != NOMBRE_A_TROUVER);
        System.out.println("Bravo tu as trouvé. Il t'as fallu " + nbEssais + " essais");
    }
}
