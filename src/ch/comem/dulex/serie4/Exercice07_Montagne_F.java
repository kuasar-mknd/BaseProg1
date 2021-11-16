package ch.comem.serie4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * Ecrire un programme permettant de saisir une phrase et qui stocke chaque mot dans une case d'un tableau.
 */
public class Exercice07_Montagne_F {

    public static void main(String[] args) {
        presenteProgramme();
        String phrase = saisiPhrase();
        String[] mots = splittePhrase(phrase);
        System.out.println(Arrays.toString(mots));
    }   

    private static void presenteProgramme() {
        System.out.println("Ce programme permet de saisir une phrase, "
                + "puis stocke chaque mot dans une case d'un tableau");
    }

    private static String saisiPhrase() {
        String phrase;
        do {
            Scanner scan = new Scanner(System.in).useLocale(new Locale("fr_CH"));
            System.out.print("Veuillez saisir une phrase : ");
            phrase = scan.nextLine().trim();
            if (phrase.length()==0) {
                System.out.println("Il faut une phrase !");
            }
        } while (phrase.length()==0);
        return phrase;
    }

    private static String[] splittePhrase(String phrase) {
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
        return mots;
    }
}