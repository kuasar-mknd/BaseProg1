package ch.comem.dulex.series3;

import java.util.Arrays;
import java.util.Scanner;


public class series3 {

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
                default -> System.out.println("L'exercice n'esxiste pas ...");
            }
        }
    }

    static void exercice1() {
        Scanner input = new Scanner(System.in);

        int[] arrValue = {1, 3};
        int value = 0;
        boolean flag = true;

        while (flag) {
            System.out.print("\nVeuillez saisir un nombre dans l'intervalle " + Arrays.toString(arrValue) + " : ");
            value = input.nextInt();
            if (value >= arrValue[0] && value <= arrValue[1]) {
                flag = false;
            } else {
                System.out.println("La valeur " + value + " ne fait pas partie de l'intervalle spécifié...");
            }
        }

        System.out.println("La valeur : " + value + " est correcte :-)");
    }

    static void exercice2() {
        Scanner input = new Scanner(System.in);

        int value = 0;
        boolean flag = true;

        while (flag) {
            System.out.print("\nVeuillez saisir un nombre strictement positif : ");
            value = input.nextInt();
            if (value > 0) {
                flag = false;
            } else {
                System.out.println("Le nombre n'est pas strictement positif");
            }
        }
        System.out.println("Compte à rebours à partir de " + value);
        for (int i=value; i>=0; i--){
            System.out.println(i);
        }
    }

    static void exercice3(){
        Scanner input = new Scanner(System.in);

        int lowestValue = 1, highestValue;

        System.out.println("Ce programme affiche les nombres paires entre " + lowestValue + " et une limite supérieur saisie par l'utilisateur.");
        System.out.print("Entrez la limite supérieure (>=2) des nombres pairs à afficher : ");
        highestValue = input.nextInt();

        System.out.println("Liste des nombres pairs entre " +lowestValue + " et " + highestValue +" est :");

        for(int i=lowestValue; i<=highestValue; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}
