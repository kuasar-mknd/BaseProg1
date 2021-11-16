package ch.comem.serie4;

import java.util.Locale;
import java.util.Scanner;

/**
 *  Soit la file d'attente suivante : ["Aline","Roger","Julia","Steven","Jules"]
 *  Veuillez écrire un programme permettant de saisir un prénom et de dire à quelle position il se trouve dans la file.
 *  	Exemple 1 :
 *  			Veuillez saisir un prénom :
 *  			Julia
 *  			Julia se trouve en 3e  position dans la file
 *  	Exemple 2 :
 *  			Veuillez saisir un prénom :
 *                      Fritz
 *  			Fritz ne se trouve pas dans la file
 */

public class Exercice03_File {

    public static void main(String[] args) {
        String[] file = {"Aline", "Roger", "Julia", "Steven", "Jules"};
        Scanner scan = new Scanner(System.in).useLocale(new Locale("fr_CH"));
        System.out.print("Veuillez saisir un prénom : ");
        String nom = scan.nextLine().trim(); // .tim() enlève les espaces en début et en fin de chaîne
        int i = -1;
        boolean trouve = false;
        do {
            i++;
            trouve = file[i].equals(nom); // pour comparer deux chaînes il ne faut pas utiliser == mais .equals(...)
        } while (!trouve && i<file.length-1);
        if (trouve) {
            System.out.println(nom + " se trouve en " + (i+1) + "e position dans la file");
        } else {
            System.out.println(nom + " ne se trouve pas dans la file");
        }
    }
}
