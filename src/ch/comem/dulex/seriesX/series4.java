package ch.comem.dulex.seriesX;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class series4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int intChoice;


        while (true) {
            System.out.print("\n\nQuel exercice voulez-vous exécuter ? : ");
            intChoice = input.nextInt();

            switch (intChoice) {
                case 1 -> exercice1();
                case 2 -> exercice2();
                default -> System.out.println("L'exercice n'esxiste pas ...");
            }
        }
    }
    static void exercice1(){
        int[] arrayToInverse = {5,2,5,8,9,10};

        for (int i=arrayToInverse.length-1; i>=0; i--){
            System.out.println(arrayToInverse[i]);
        }
    }

    static void exercice2(){
        Integer[] arrayToInverse = {1,2,3,4,5,6,7,8,9};

        System.out.println("Avant : " + Arrays.asList(arrayToInverse));
        Collections.reverse(Arrays.asList(arrayToInverse));
        System.out.println("Après : " + Arrays.asList(arrayToInverse));
    }
    
}
