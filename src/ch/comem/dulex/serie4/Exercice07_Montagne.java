package ch.comem.serie4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * Ecrire un programme permettant de saisir une phrase et qui stocke chaque mot dans une case d'un tableau.
 */
public class Exercice07_Montagne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(new Locale("fr_CH"));
        System.out.print("Veuillez saisir une phrase : ");
        String phrase = scan.nextLine().trim();
        //On compte le nombre d'espaces pour pouvoir dimentionner le tableau
        int compteur = 0;
        boolean stocke = false;
        char precedant = '_';
        final char ESPACE = ' ';
        char car;
        for (int i = 0; i < phrase.length(); i++) {
            car = phrase.charAt(i);
            if (car==ESPACE && precedant!=ESPACE) {
                compteur++;
            }
            precedant = car;
        }
        String[] mots = new String[compteur+1];
        String mot = "";
        int j=0;
        for (int i = 0; i < phrase.length(); i++) {
            car = phrase.charAt(i);
            if (car!=ESPACE) {
                mot+=car;
            } else {
                if (precedant != ESPACE) {
                    mots[j] = mot;
                    mot = "";
                    j++;
                }
            }
            precedant = car;
        }
        mots[j] = mot;
        System.out.println(Arrays.toString(mots));
    }   
}