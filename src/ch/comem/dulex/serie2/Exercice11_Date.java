package ch.comem.serie2;

import java.util.Locale;
import java.util.Scanner;

/*
    Ecrire un programme qui demande à l'utilisateur de saisir une date sous la forme de trois entiers (jour / mois / année). Indiquez à l'utilisateur si la date saisie est valide ou non. 

    Quelques indications :

    Pour la durée du mois, c'est selon le numéro du mois :
     - pour les mois 4, 6, 9, 11 : 30 jours
     - pour le mois 2, 29 jours pour les années bissextiles sinon c'est 28 jours
     - pour les autres, 31 jours

    Pour une année bissextile :
    Si l'année est divisible par 4 mais pas par 100 ou si elle est divisible par 400, alors elle est bissextile sinon elle ne l'est pas.

    ​     Exemple :
    ​          Veuillez saisir le jour : 29
    ​          Veuillez saisir le mois : 2
    ​          Veuillez saisir l'année : 2000

    ​          La date 29.2.2000 est valide 
*/

public class Exercice11_Date {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.print("Saisissez le jour: ");
        int jour = scanner.nextInt();
        System.out.print("Saisissez le mois: ");
        int mois = scanner.nextInt();
        System.out.print("Saisissez l'année: ");
        int annee = scanner.nextInt();

        boolean dateValide = false;
        if ((annee != 0) && (mois >= 1 && mois <= 12)) {
            int nbJoursDuMois;
            switch (mois) {
                case 4:
                case 6:
                case 9:
                case 11:
                    nbJoursDuMois = 30;
                    break;
                case 2:
                    if (((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0))) {
                        nbJoursDuMois = 29;
                    } else {
                        nbJoursDuMois = 28;
                    }   break;
                default:
                    nbJoursDuMois = 31;
                    break;
            }
            dateValide = (jour >= 1 && jour <= nbJoursDuMois);
        }

        System.out.print("La date " + jour + "." + mois + "." + annee);
        if (dateValide) {
            System.out.print(" est");
        } else {
            System.out.print(" n'est pas");
        }
        System.out.println(" valide.");
    }
}