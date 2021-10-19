package ch.comem.dulex.seriesX;

import java.util.Scanner;


public class seriesX {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int intChoice;


        while (true) {
            System.out.print("\n\nQuel exercice voulez-vous exécuter ? : ");
            intChoice = input.nextInt();

            switch (intChoice) {
                case 1 -> ...;
                default -> System.out.println("L'exercice n'esxiste pas ...");
            }
        }
    }
