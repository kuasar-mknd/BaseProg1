package ch.comem.m501;

import java.util.Arrays;
import java.util.Scanner;

public class DulexSamuelProbleme1 {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNbArticles;
        float userInput;
        
        inputNbArticles = askUserQuestion("Combien d'articles voulez-vous saisir ? ");

        String[][] arrayNameArticles = new String[inputNbArticles][2];
        Float[] arrayValueArticles = new Float[inputNbArticles];

        for (int i = 0; i < inputNbArticles; i++) {
            arrayNameArticles = askUserNameArticle(arrayNameArticles, i);
            arrayValueArticles = askUserValueArticle(arrayValueArticles, i);

        }
        for (int i = 0; i < arrayValueArticles.length; i++) {
            arrayNameArticles[i][1] = String.valueOf(arrayValueArticles[i]);
        }

        printTicket(arrayNameArticles, arrayValueArticles);


    }

    private static String[][] askUserNameArticle(String[][] arrayNameArticles, int i) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nom du " + (i +1) + "e article : ");
        arrayNameArticles[i][0] = input.nextLine();
        return arrayNameArticles;
    }

    private static Float[] askUserValueArticle(Float[] arrayValueArticles, int i) {
        Scanner input = new Scanner(System.in);
        float userInput;
        do {
            System.out.print("Prix du " + (i +1) + "e article : ");
            userInput = input.nextFloat();
        } while(!checkIfNotNullFloat(userInput));
        arrayValueArticles[i] = userInput;
        return arrayValueArticles;
    }

    private static int askUserQuestion(String outputQuestion) {
        Scanner input = new Scanner(System.in);
        int userInput;
        do {
            System.out.print(outputQuestion);
            userInput = input.nextInt();
        }while (!checkIfNotNullInt(userInput));
        return userInput;
    }

    private static boolean checkIfNotNullInt(int input){
        return input>0;
    }

    private static boolean checkIfNotNullFloat(Float input){
        return input>0;
    }

    private static void printTicket(String[][] arrayNameArticles, Float[] arrayValueArticles){
        final double PRECISION = 0.05;
        final double PRECISION_ARTICLE = 0.001;

        String firstLine = "***** TICKET DE CLIENT *****";
        String spaceLine = "----------------------------";
        String totalWithoutTVA = "Total sans TVA :";
        String tvaPrice = "TVA (7.7%) :";
        String totalWithTVA = "Total avec TVA :";
        int ticketLenght = firstLine.length();
        int articleLenght = 0;
        int nbOfSpace;
        float calcTotalWithTVA, calcTotalWithoutTVA = 0F, calcTVA;

        System.out.println(firstLine);

        Arrays.sort(arrayValueArticles);
        reverseArray(arrayValueArticles);

        for (Float arrayValueArticle : arrayValueArticles) {
            for (String[] arrayNameArticle : arrayNameArticles) {
                if (arrayNameArticle[1].equals(arrayValueArticle.toString())) {
                    System.out.print(arrayNameArticle[0] + " :");
                    articleLenght = arrayNameArticle[0].length() + 2;
                }
            }
            nbOfSpace = ticketLenght - articleLenght - arrayValueArticle.toString().length();
            for (int i = 0; i < nbOfSpace; i++) {
                System.out.print(" ");
            }
            System.out.println(Math.round(arrayValueArticle/PRECISION_ARTICLE)*PRECISION_ARTICLE);
            calcTotalWithoutTVA += arrayValueArticle;
        }

        System.out.println(spaceLine);
        calcTVA = calcTotalWithoutTVA*7.7F/100;
        calcTotalWithTVA = calcTotalWithoutTVA + calcTVA;

        printLineTicket(totalWithoutTVA, ticketLenght, (float) (Math.round(calcTotalWithoutTVA/PRECISION_ARTICLE)*PRECISION_ARTICLE));
        printLineTicket(tvaPrice, ticketLenght, (float) (Math.round(calcTVA/PRECISION_ARTICLE)*PRECISION_ARTICLE));

        System.out.println(spaceLine);

        printLineTicket(totalWithTVA, ticketLenght, (float) (Math.round(calcTotalWithTVA/PRECISION)*PRECISION));


    }

    private static void printLineTicket(String textToPrint, int ticketLenght, Float valueToPrint) {
        int nbOfSpace;
        System.out.print(textToPrint);
        nbOfSpace = ticketLenght - textToPrint.length() - valueToPrint.toString().length();
        for (int i = 0; i < nbOfSpace; i++) {
            System.out.print(" ");
        }
        System.out.println(valueToPrint);
    }

    private static void reverseArray(Float[] tab){
        Float temp;
        int iFin = tab.length-1;
        for (int i = 0; i < tab.length/2; i++) {
            temp = tab[i];
            tab[i] = tab[iFin-i];
            tab[iFin-i] = temp;
        }

    }

}
