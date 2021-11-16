package ch.comem.serie2;

import java.util.Locale;
import java.util.Scanner;

/*
    Ecrire un programme qui saisit et calcule la valeur absolue d’un réel. 
    Afficher le résultat sous la forme : "La valeur absolue de -5 est 5" 
*/
public class Exercice01_Abs {

    public static void main(String[] args) {
        System.out.println("Ce programme saisi une valeur et affiche sa valeur absolue");
        
        // Saisie de la valeur
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.print("Entrez un nombre dont vous voulez la"
                + " valeur absolue: ");
        double nb = scanner.nextDouble();
        
        // Calcul
        double abs;
        if (nb<0) {
            abs = nb*-1;
        } else {
            abs = nb;
        }
        
        // Affichage du résultat
        System.out.println("La valeur absolue de " + nb + " est " + abs);
    }
}
