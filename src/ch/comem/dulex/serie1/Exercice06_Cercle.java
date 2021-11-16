package ch.comem.serie1;

import java.util.Locale;
import java.util.Scanner;

/*
        L'utilisateur saisit la valeur du rayon d'un cercle et le programme calcule 
        et affiche la surface et la circonférence.
        Exemple : 
            Veuillez saisir la valeur du rayon du cercle : 10.5
            La surface du cercle est de : 346.360590058274
            La circonférence est de : 65.9734457253856
*/

public class Exercice06_Cercle {

    public static void main(String[] args) {
        System.out.println("Calcul de la surface et de la circonférence d'un cercle.");
        
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.print("Veuillez saisir la valeur du rayon du cercle : ");
        double rayon = scanner.nextDouble();
        double surface = rayon * rayon * Math.PI;
        double circonference = rayon * 2 * Math.PI;
        System.out.println("La surface du cercle est de : " + surface);
        System.out.println("La circonférence d'un cercle est de : " + circonference);
    }
}
