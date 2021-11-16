package ch.comem.serie2;

import java.util.Locale;
import java.util.Scanner;

/*

Veuillez écrire un programme qui résout l’équation du premier degré : ax+b=0. 
L'utilisateur saisit les valeurs réelles de a et de b puis le programme calcule et affiche la valeur de x. 

    Exemple : Soit l'équation ax+b = 0
   ​           Veuillez saisir la valeur de a : 0.5
   ​           Veuillez saisir la valeur de b : 5
   ​           L'équation 0.5*x+5=0, a comme solution x=-10

Remarque : Il y a un petit piège dans lequel il ne faudrait pas tomber ;-)

*/

public class Exercice06_EquationPremierDegre {
    private static final Scanner INPUT = new Scanner(System.in).useLocale(new Locale("fr-CH"));

    public static void main(String[] args) {
        System.out.println("Ce programme trouve la solution de l'équation ax+b=0");
        double a;
        
        System.out.println("Entrez la valeur de a : ");
        a = INPUT.nextDouble();
        double b;
        
        System.out.println("Entrez la valeur de b : ");
        b = INPUT.nextDouble();
        System.out.print("L'équation " + a + "*x + " + b + " = 0 ");
        if (a != 0) {
            double x;
            x = -b / a;
            System.out.println("a comme solution x = " + x);
        } else {
            if (b == 0) {
                System.out.println("a une infinité de solution");
            } else {
                System.out.println("n'a pas de solution");
            }
        }
    }
}