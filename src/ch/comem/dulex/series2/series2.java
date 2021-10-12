package ch.comem.dulex.series2;

import java.util.Locale;
import java.util.Scanner;

public class series2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int intChoice;


        while (true) {
            System.out.print("\n\nQuel exercice voulez-vous exécuter ? : ");
            intChoice = input.nextInt();

            switch (intChoice) {
                case 1 -> exercice1();
                case 2 -> exercice2();
                case 3 -> exercice3();
                case 4 -> exercice4();
                case 5-> exercice5();
                case 6 -> exercice6();

            }
        }
    }

    static void exercice1(){
        Scanner input = new Scanner(System.in);
        int intNumber;

        System.out.print("\nVeuillez saisir un nombre : ");
        intNumber = input.nextInt();

        System.out.println("La valeur absolue de " + intNumber + " est " + Math.abs(intNumber));
    }

    static void exercice2(){
        Scanner input = new Scanner(System.in);
        char chaInput;

        System.out.print("\nVeuillez saisir une lettre : ");
        chaInput = input.next().charAt(0);

        System.out.println("Le charactère " + chaInput + " est-il un charatère majuscule ? : " + Character.isUpperCase(chaInput));
    }

    static  void exercice3(){
        Scanner input = new Scanner(System.in);
        String strVoyelle = "aeiouy";
        char chaInput;

        System.out.print("\nVeuillez saisir une lettre : ");
        chaInput = input.next().toLowerCase().charAt(0);

        System.out.println("Le charactère " + chaInput + " est-il une voyelle ? : " + strVoyelle.contains(Character.toString(chaInput)));
    }

    static  void exercice4(){
        Scanner input = new Scanner(System.in);
        int intInput;

        System.out.print("\nVeuillez saisir un chiffre : ");
        intInput = input.nextInt();

        String[] result = { "Positif", "Negatif" };

        // checks if the number is positive or negative
        String strResult = result[(intInput >> 31) & 1];

        System.out.println("Le chiffre " + intInput + " est-il positif ou négatif ? : " + strResult);
    }

    static  void exercice5(){
        Scanner input = new Scanner(System.in);
        int intInput;
        int ans;

        System.out.print("\nVeuillez saisir un chiffre : ");
        intInput = input.nextInt();
        ans = Integer.signum(intInput);

        if (ans == 0)
            System.out.print("Le chiffre " + intInput + " est égal à zéro");
        else if (ans == 1)
            System.out.print("Le chiffre " + intInput + " est positif");
        else
            System.out.print("Le chiffre " + intInput + " est négatif");
    }

    static void exercice6(){
        Scanner input = new Scanner(System.in);
        float intA;
        float intB;
        float intX = 0;

        System.out.println("\nSoit l'équation ax + b = 0");
        System.out.print("\tVeuilez choisir une valeur pour a : ");
        intA = input.nextFloat();
        System.out.print("\n\tVeuilez choisir une valeur pour b : ");
        intB = input.nextFloat();

        intX = (intX-intB)/intA;

        System.out.println("La valeur de x pour que l'équation soit correcte est " + intX);
    }
}
