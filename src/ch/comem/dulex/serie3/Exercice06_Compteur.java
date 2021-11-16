package ch.comem.serie3;

import java.util.Locale;
import java.util.Scanner;

/**
 * Compter combien il y a de nombres inférieurs ou égaux à 15 dans une liste de 10 nombres entiers.
 */
public class Exercice06_Compteur {

    public static void main(String[] args) {
        final int NB_ELEMENTS = 10;
        final int NB_LIMITE = 15;
        
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        //avec un flot vide, aucun nombre n'est plus petit que la limite
        int nb;
        int compteur = 0;
        //pour chaque membre du flot
        for (int i = 0; i < NB_ELEMENTS; i++) {
            System.out.print("Entrez le " + (i+1) + "e nombre:");
            nb = scanner.nextInt();
            //si le nombre est plus petit ou égal à la limite on incrémente le compteur
            if (nb <= NB_LIMITE) {
                compteur++;
            }
        }
        System.out.println("Il y a " + compteur + " nombre(s) inférieurs ou égaux à " + NB_LIMITE);
    }
}