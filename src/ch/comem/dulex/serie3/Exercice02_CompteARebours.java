package ch.comem.serie3;

import java.util.Locale;
import java.util.Scanner;

public class Exercice02_CompteARebours {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        int nb;
        do {
            System.out.print("Entrez un entier strictement positif: ");
            nb = scanner.nextInt();
            if (nb<=0) System.out.println("Le nombre n'est pas strictement positif");
        } while (nb<=0);
        
        System.out.println("Compte à rebours à partir de " + nb);
        System.out.println("***********************************");
        int rebours=nb;
        while (rebours>=0){
            System.out.println(rebours);
            rebours--;
        }
    }
}