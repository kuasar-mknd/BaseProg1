package ch.comem.dulex.series2;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
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
                case 9 -> exercice9();
                case 10 -> exercice10();
                case 11 -> exercice11();
                case 12 -> exercice12();

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
        int reduction = 0;
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

        switch (typeAnswer) {
            case 1 -> reduction += 0;
            case 2 -> reduction += typeEmployed;
            case 3 -> reduction += typeCigogne;
        }

        if (numberOfFlight > minFlight) {
            if (numberOfFlight < maxFlight) {
                reduction += middleFlightReduce;
            } else {
                reduction += maxFlightReduce;
            }
        } else if (numberOfFlight == minFlight) {
            reduction += minFlightReduce;
        }

        finalPrice = (100 - reduction) * flightPrice / 100;

        System.out.println("Prix de base : " + flightPrice);
        System.out.println("Votre rabais : " + reduction);
        System.out.println("Votre prix : " + Math.round(finalPrice * 10000) / 10000);

    }

    static void exercice9() {
        Scanner input = new Scanner(System.in);
        DecimalFormat formatFinal = new DecimalFormat("0.00");
        int personAge;
        String dayWeek;
        int childAge = 7;
        int childPrice = 5;
        int youngAge = 18;
        int youngPrice = 10;
        int otherPrice = 15;
        int finalPromo = 0;
        int finalPrice;

        String[][] arrWeek = {{"lundi", "20"}, {"mardi", "10"}, {"mercredi", "0"}, {"jeudi", "10"}, {"vendredi", "0"}, {"samedi", "0"}, {"dimanche", "0"}};

        System.out.print("\nSaissez l'âge de la personne : ");
        personAge = input.nextInt();

        System.out.print("\nVeuillez entrer le nom du jour en miniscule (Ex: lundi) : ");
        dayWeek = input.next();
        for (String[] strings : arrWeek) {
            if (strings[0].equals(dayWeek)) {
                finalPromo += Integer.parseInt(strings[1]);
            }
        }

        if (personAge <= childAge) {
            finalPrice = childPrice - (childPrice * finalPromo / 100);
            System.out.println("Prix de base : " + childPrice);
        } else {
            if (personAge <= youngAge) {
                finalPrice = youngPrice - (youngPrice * finalPromo / 100);
                System.out.println("Prix de base : " + youngPrice);
            } else {
                finalPrice = otherPrice - (otherPrice * finalPromo / 100);
                System.out.println("Prix de base : " + otherPrice);
            }
        }

        System.out.println("Votre rabais : " + finalPromo + "%");
        System.out.println("Votre prix : " + formatFinal.format(Math.round(finalPrice * 2.0) / 2.0) + " chf");

    }

    static void exercice10() {
        Scanner input = new Scanner(System.in);
        DecimalFormat formatFinal = new DecimalFormat("0.00");
        int[][] arrPromo = {{50, 3}, {100, 5}, {1000, 10}};
        float[][] arrTVA = {{0, 8.2F}, {250, 6.3F}, {500, 4.5F}};
        int quantity;
        int finalPromo = 0;
        float finalTVA = 0;
        float pricePiece;
        float finalPrice;

        System.out.print("\nCombien de pièces voulez-vous acheter ? : ");
        quantity = input.nextInt();

        System.out.print("\nQuel est le prix unitaire de la pièce ? : ");
        pricePiece = input.nextFloat();

        for (int[] ints : arrPromo) {
            if (quantity > ints[0]) {
                finalPromo = ints[1];
            }
        }

        for (float[] floats : arrTVA) {
            if (quantity > floats[0]) {
                finalTVA = floats[1];
            }
        }

        finalPrice = (quantity * pricePiece) - (quantity * pricePiece * finalPromo / 100) + (quantity * pricePiece * finalTVA / 100);

        System.out.println("Le prix TTC pour " + quantity + " pièces à " + pricePiece + ".- avec un rabais de " + finalPromo + "% et un taux TVA à " + finalTVA + "% sera de : " + formatFinal.format(Math.round(finalPrice*10.0)/10.0) + ".-");

    }

    static void exercice11() {
        Scanner input = new Scanner(System.in);
        boolean status = false;
        String pattern = "(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/([0-9]{4})";
        boolean flag = false;
        int dayDate;
        int monthDate;
        int yearDate;

        System.out.print("\nVeuillez saisir le jour : ");
        dayDate = input.nextInt();

        System.out.print("\nVeuillez saisir le mois : ");
        monthDate = input.nextInt();

        System.out.print("\nVeuillez saisir l'année : ");
        yearDate = input.nextInt();

        String date = dayDate + "/" + monthDate + "/" + yearDate;

        if (date.matches(pattern)) {
            flag = true;
        }
        if (flag) {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false);
            try {
                dateFormat.parse(date);
                status = true;
            } catch (Exception ignored) {
            }
        }

        if (status)
            System.out.println("La date du " + dayDate + "." + monthDate + "." + yearDate + " est valide");
        else
            System.out.println("La date du " + dayDate + "." + monthDate + "." + yearDate + " est invalide");
    }

    static void exercice12() {
        Scanner input = new Scanner(System.in);
        int countFive;
        int countTwo;
        int countOne;

        System.out.print("\nVeuillez saisir la somme à décomposer : ");
        int moneyValue = input.nextInt();

        countFive = moneyValue % 5;
        countTwo = (moneyValue - (countFive * 5)) % 2;
        countOne = moneyValue - (countFive * 5) - (countTwo * 2);
        System.out.println("\t" + countFive + " pièces de 5.-");
        System.out.println("\t" + countTwo + " pièces de 2.-");
        System.out.println("\t" + countOne + " pièces de 1.-");
    }
}
