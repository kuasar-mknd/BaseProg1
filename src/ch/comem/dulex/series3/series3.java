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
                default -> System.out.println("L'exercice n'esxiste pas ...");
            }
        }
    }

    static void exercice1(){
        Scanner input = new Scanner(System.in);

        int[] arrValue = {1,3};
        int value=0;
        boolean flag = true;

        while (flag){
            System.out.print("\nVeuillez saisir un nombre dans l'intervalle " + Arrays.toString(arrValue) + " : ");
            value = input.nextInt();
            if (value >= arrValue[0] && value <= arrValue[1]){
                flag = false;
            }
            else {
                System.out.println("La valeur " + value + " ne fait pas partie de l'intervalle spécifié...");
            }
        }

        System.out.println("La valeur : " + value + " est correcte :-)");
    }

    static void exercice2(){
        Scanner input = new Scanner(System.in);
        
    }
}
