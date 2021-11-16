package ch.comem.serie2;

import java.util.Locale;
import java.util.Scanner;

/*
    Veuillez écrire un programme qui saisit trois nombres a, b, c et qui affiche les valeurs saisies par ordre      croissant.

    Exemple :
   ​         Veuillez saisir le 1e nombre : 4.2
   ​         Veuillez saisir le 2e nombre : 10.5
   ​         Veuillez saisir le 3e nombre : -5
   ​         Vous avez saisi les valeurs suivantes : -5, 4.2 et 10.5
*/

public class Exercice07_TrierTroisNombres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.print("Entrez la valeur de a: ");
        double a = scanner.nextDouble();
        System.out.print("Entrez la valeur de b: ");
        double b = scanner.nextDouble();
        System.out.print("Entrez la valeur de c: ");
        double c = scanner.nextDouble();

        double petit = a;
        double moyen = b;
        double grand = c;
        double temp;
        if (petit > moyen){
            temp = moyen;
            moyen = petit;
            petit = temp;
        }
        if (moyen > grand){
            temp = grand;
            grand = moyen;
            moyen = temp;
        }
        if (petit > moyen){
            temp = moyen;
            moyen = petit;
            petit = temp;
        }
        System.out.print("Les trois nombres (" + a + ", " + b + ", " + c + ") triés par ordre croissant: ");
        System.out.println(petit + ", " + moyen + ", " + grand);
    }
}