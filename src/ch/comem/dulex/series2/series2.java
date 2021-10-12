package ch.comem.dulex.series2;

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
}
