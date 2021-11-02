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
                case 3 -> exercice3();
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

    static void exercice3(){
        Scanner input = new Scanner(System.in);

        String[] arrayName = {"Aline", "Roger", "Julia", "Steven", "Jules"};
        boolean flag=false;
        String target;

        System.out.print("Veuillez saisir un prénom : ");
        target = input.next();
        for (int i = 0; i < arrayName.length; i++)
        {
            if (target.equals(arrayName[i])) {
                System.out.println(target + " se trouve en " + (i+1) + "e position dans la file");
                flag = true;
            }
        }
        if (!flag){
            System.out.println(target + " ne se trouve pas dans la file");
        }
    }
}
