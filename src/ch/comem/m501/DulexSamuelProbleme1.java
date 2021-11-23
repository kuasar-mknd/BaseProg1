package ch.comem.m501;

import java.util.Scanner;

public class DulexSamuelProbleme1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] arrayValues = {{"E","Eau"},{"T","Thé froid"},{"P", "jus de Pommes"}, {"Q", "Quitter"}};
        String userInput;
        boolean flag = true;

        do {
            System.out.println("Quelle boisson voulez-vous ?");
            for (String[] arrayValue : arrayValues) {
                System.out.println("Tappez " + arrayValue[0] + " pour : " + arrayValue[1]);
            }
            userInput = input.nextLine();
            switch (userInput) {
                case "E" -> {
                    System.out.println("Votre "+arrayValues[0][1]+" est prête");
                }
                case "T" -> {
                    System.out.println("Votre "+arrayValues[1][1]+" est prêt");
                }
                case "P" -> {
                    System.out.println("Votre "+arrayValues[2][1]+" est prêt");
                }
                case "Q" -> {
                    flag = false;
                }
                default -> System.out.println("Votre choix ne correspond pas à une des options !");
            }
            if(flag) {
                System.out.print("Tapez sur la touche 'Enter' pour continuer");
                input.nextLine();
                System.out.println("(Appui sur la touche 'Enter')");
            }
        }while (flag);
    }
}
