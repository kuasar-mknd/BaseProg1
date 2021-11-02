package ch.comem.dulex.seriesX;

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
    
}
