package ch.comem.serie3;

import java.util.Locale;
import java.util.Scanner;

public class Exercice01_ControleDeSaisie {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        double nb;
        do {
            System.out.print("Veuillez saisir un nombre dans l'intervalle [1;3]");
            nb = scanner.nextDouble();
        } while (nb<1 || nb>3);
        //si on arrive ici c'est que nb est bien entre 1 et 3.
        System.out.println("Le nombre saisi est: " + nb);
    }
}
