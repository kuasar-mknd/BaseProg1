package ch.comem.dulex.series2;

import java.util.Arrays;
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
                case 5 -> exercice5();
                case 6 -> exercice6();
                case 7 -> exercice7();
                case 8 -> exercice8();

            }
        }
    }

    static void exercice1() {
        Scanner input = new Scanner(System.in);
        int intNumber;

        System.out.print("\nVeuillez saisir un nombre : ");
        intNumber = input.nextInt();

        System.out.println("La valeur absolue de " + intNumber + " est " + Math.abs(intNumber));
    }

    static void exercice2() {
        Scanner input = new Scanner(System.in);
        char chaInput;

        System.out.print("\nVeuillez saisir une lettre : ");
        chaInput = input.next().charAt(0);

        System.out.println("Le charactère " + chaInput + " est-il un charatère majuscule ? : " + Character.isUpperCase(chaInput));
    }

    static void exercice3() {
        Scanner input = new Scanner(System.in);
        String strVoyelle = "aeiouy";
        char chaInput;

        System.out.print("\nVeuillez saisir une lettre : ");
        chaInput = input.next().toLowerCase().charAt(0);

        System.out.println("Le charactère " + chaInput + " est-il une voyelle ? : " + strVoyelle.contains(Character.toString(chaInput)));
    }

    static void exercice4() {
        Scanner input = new Scanner(System.in);
        int intInput;

        System.out.print("\nVeuillez saisir un chiffre : ");
        intInput = input.nextInt();

        String[] result = {"Positif", "Negatif"};

        // checks if the number is positive or negative
        String strResult = result[(intInput >> 31) & 1];

        System.out.println("Le chiffre " + intInput + " est-il positif ou négatif ? : " + strResult);
    }

    static void exercice5() {
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

    static void exercice6() {
        Scanner input = new Scanner(System.in);
        float intA;
        float intB;
        float intX = 0;

        System.out.println("\nSoit l'équation ax + b = 0");
        System.out.print("\tVeuilez choisir une valeur pour a : ");
        intA = input.nextFloat();
        System.out.print("\n\tVeuilez choisir une valeur pour b : ");
        intB = input.nextFloat();

        intX = (intX - intB) / intA;

        System.out.println("La valeur de x pour que l'équation soit correcte est " + intX);
    }


    static void exercice7() {
        Scanner input = new Scanner(System.in);
        int n = 4;
        int[] intArrayValues = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Veuilez choisir une valeur : ");
            intArrayValues[i] = input.nextInt();
        }

        Arrays.sort(intArrayValues);

        System.out.print("Vous avez saisi les valeures suivantes : ");
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                System.out.print(intArrayValues[i] + ", ");
            } else {
                System.out.println("et " + intArrayValues[i]);
            }
        }
    }

    static void exercice8() {
        Scanner input = new Scanner(System.in);
        int typeAnswer;
        int typeEmployed = 20;
        int typeCigogne = 10;
        int minFlight = 1;
        int minFlightReduce = 10;
        int maxFlight = 5;
        int maxFlightReduce = 20;
        int middleFlightReduce = 15;
        int numberOfFlight;
        int reduction=0;
        float flightPrice = 0;
        float finalPrice;

        System.out.print("\nEntrez le prix du billet : ");
        flightPrice = input.nextFloat();

        System.out.println("Tapez 1 si vous êtes un client normal");
        System.out.println("Tapez 2 si vous êtes un employé de la compagnie");
        System.out.println("Tapez 3 si vous êtes membre du club CIGOGNE");
        System.out.print("\nVotre réponse : ");
        typeAnswer = input.nextInt();

        System.out.print("\nEntrez le nombre de vols effectués avec notre compagnie : ");
        numberOfFlight = input.nextInt();

        switch (typeAnswer){
            case 1 -> reduction += 0;
            case 2 -> reduction += typeEmployed;
            case 3 -> reduction += typeCigogne;
        }

        if(numberOfFlight>minFlight){
            if (numberOfFlight<maxFlight){
                reduction += middleFlightReduce;
            }
            else {
                reduction += maxFlightReduce;
            }
        }
        else if(numberOfFlight == minFlight){
            reduction += minFlightReduce;
        }

        finalPrice = (100-reduction)*flightPrice/100;

        System.out.println("Prix de base : "+flightPrice);
        System.out.println("Votre rabais : "+reduction);
        System.out.println("Votre prix : " + Math.round(finalPrice * 10000)/10000);

    }
}
