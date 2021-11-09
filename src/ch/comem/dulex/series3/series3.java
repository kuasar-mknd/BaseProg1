package ch.comem.dulex.series3;

import java.util.Arrays;
import java.util.Random;
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
                case 4 -> exercice4();
                case 5 -> exercice5();
                case 6 -> exercice6();
                case 7 -> exercice7();
                case 8 -> exercice8();
                case 9 -> exercice9();
                case 10 -> exercice10();
                case 11 -> exercice11();
                case 12 -> exercice12();
                case 13 -> exercice13();
                case 14 -> exercice14();
                case 15 -> exercice15();
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
        for (int i = value; i >= 0; i--) {
            System.out.println(i);
        }
    }

    static void exercice3() {
        Scanner input = new Scanner(System.in);

        int lowestValue = 1, highestValue;

        System.out.println("Ce programme affiche les nombres paires entre " + lowestValue + " et une limite supérieur saisie par l'utilisateur.");
        System.out.print("Entrez la limite supérieure (>=2) des nombres pairs à afficher : ");
        highestValue = input.nextInt();

        System.out.println("Liste des nombres pairs entre " + lowestValue + " et " + highestValue + " est :");

        for (int i = lowestValue; i <= highestValue; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    static void exercice4() {
        Scanner input = new Scanner(System.in);
        float capital, interest;
        int period = 0;

        System.out.print("Entrez le capital (>0) de départ : ");
        capital = input.nextFloat();

        System.out.print("Entrez le taux d'intérêt en % : ");
        interest = input.nextFloat();

        System.out.print("Entrez le nombre de prériodes (>0) : ");
        period = input.nextInt();

        System.out.println("Une somme de " + capital + " placée durant " + period + " période(s) avec un taux d'intérêt de " + interest + "% génère :");
        for (int i = period; i > 0; i--) {
            capital = capital + (capital * interest / 100);
            System.out.println("après " + period + " période(s) : " + capital);
        }
    }

    static void exercice5() {
        Scanner input = new Scanner(System.in);

        int[] arrayValue = new int[5];

        for (int i = 0; i < arrayValue.length; ++i) {
            System.out.print("Entrez le nombre " + (i + 1) + " : ");
            arrayValue[i] = input.nextInt();
        }

        Arrays.sort(arrayValue);

        System.out.println("Le plus petit nombre saisi est : " + arrayValue[0]);
        System.out.println("Le plus grand nombre saisi est : " + arrayValue[arrayValue.length - 1]);

    }

    static void exercice6() {
        Scanner input = new Scanner(System.in);

        int[] arrayValue = new int[5];
        int minimumValue = 15, count = 0;

        for (int i = 0; i < arrayValue.length; ++i) {
            System.out.print("Entrez le nombre " + (i + 1) + " : ");
            arrayValue[i] = input.nextInt();
        }

        Arrays.sort(arrayValue);

        for (int i : arrayValue) {
            if (i <= minimumValue) {
                count++;
            }
        }

        System.out.println("Il y a " + count + " nombre(s) <= 15");
    }

    static void exercice7() {
        Scanner input = new Scanner(System.in);
        int minValue = 1, maxValue, finalResult = 0;

        System.out.print("Entrez la valeur maximale : ");
        maxValue = input.nextInt();

        for (int i = minValue; i < maxValue; i++) {
            finalResult += i;
            System.out.print(i + " + ");
        }

        finalResult += maxValue;
        System.out.print(maxValue + " = " + finalResult);

    }

    static void exercice8() {
        Scanner input = new Scanner(System.in);
        int minValue = 1, maxValue, finalResult = 1;

        System.out.print("Entrez la valeur maximale : ");
        maxValue = input.nextInt();

        for (int i = minValue; i < maxValue; i++) {
            finalResult = finalResult * i;
            System.out.print(i + " x ");
        }

        finalResult = finalResult * maxValue;
        System.out.print(maxValue + " = " + finalResult);
    }

    static void exercice9() {
        Scanner input = new Scanner(System.in);
        float[] arrayNote;
        float minNote = 1, maxNote = 6, sum = 0, averageNote, transferValue;
        int countNote;

        System.out.print("Saissisez le nombre de notes : ");
        countNote = input.nextInt();
        arrayNote = new float[countNote];

        for (int i = 0; i < arrayNote.length; ++i) {
            System.out.print("Saissisez la note " + (i + 1) + " : ");
            transferValue = input.nextFloat();
            if (transferValue >= minNote && transferValue <= maxNote) {
                arrayNote[i] = transferValue;
            }
        }

        for (float num : arrayNote) {
            sum = sum + num;
        }

        averageNote = sum / arrayNote.length;

        Arrays.sort(arrayNote);

        System.out.println("La moyenne est de : " + averageNote);
        System.out.println("La note la plus élevée est de " + arrayNote[arrayNote.length - 1]);

    }

    static void exercice10() {
        Scanner input = new Scanner(System.in);

        float minNote = 1, maxNote = 6, sum = 0, averageNote, transferValue, maxUserNote = 1;
        int i = 1;
        boolean flag = true;

        while (flag) {
            System.out.print("Saissisez la note " + (i + 1) + " : ");
            transferValue = input.nextInt();
            if (transferValue >= minNote && transferValue <= maxNote) {
                sum += transferValue;
                i++;
                if (transferValue > maxUserNote) {
                    maxUserNote = transferValue;
                }
            } else {
                System.out.println("La note " + transferValue + " n'a pas été prise en compte !");
                flag = false;
            }
        }
        averageNote = sum / i;

        System.out.println("La moyenne est de : " + averageNote);
        System.out.println("La note la plus élevée est de " + maxUserNote);
    }

    static void exercice11() {
        Scanner input = new Scanner(System.in);

        int n1 = 0, n2 = 1, n3, i, count;

        System.out.print("Quel est l'ordre du nombre de Fibonacci à calculer ? (>=0) : ");
        count = input.nextInt() + 1;

        System.out.println("f(" + n1 + ") = " + n1);
        System.out.println("f(" + n2 + ") = " + n2);

        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.println("f(" + i + ") = " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    static void exercice12() {
        Scanner input = new Scanner(System.in);

        int chessboardLenght = 8;
        char chessboardBlack = '#';
        char chessboardWhite = 'o';
        boolean lastCase = true; // True = black and False = white

        for (int i = 0; i < chessboardLenght; i++) {
            for (int j = 0; j < chessboardLenght; j++) {
                if (lastCase) {
                    System.out.print(chessboardWhite + "  ");
                    lastCase = false;
                } else {
                    System.out.print(chessboardBlack + "  ");
                    lastCase = true;
                }
            }
            if(chessboardLenght%2==0) {
                lastCase = !lastCase;
            }
            System.out.print("\n");
        }


    }
    static void exercice13(){
        int max = 10;
        int min = 0;

        for (int i = min; i < max+1; i++) {
            if(i%2 == 0){
                System.out.println(i);
            }
        }

        max= 100;
        min=0;

        System.out.println("");
        for (int i = min; i < max+1; i++) {
            if(i%2 == 0 && i%7 == 0){
                System.out.println(i);
            }
        }

        System.out.println("");
        for (int i = min; i < max+1; i++) {
            if(i%2 == 0 && i%7 == 0 && i%3 ==0){
                System.out.println(i);
            }
        }

        System.out.println("");
        for (int i = min; i < max+1; i++) {
            if(i%2 == 0 && i%7 == 0 && i%3 !=0){
                System.out.println(i);
            }
        }
    }

    static void exercice14(){
        Scanner input = new Scanner(System.in);

        System.out.print("Veuillez saisir un livret : ");
        int userInput = input.nextInt();

        for (int i = 1; i < 12+1; i++) {
            int sum = i * userInput;
            System.out.println(i + " x " +userInput + " = " + sum);
        }
    }

    static void exercice15(){
        Random random = new Random();
        int numberOfLaunch = 1000;
        int rand;
        int numberOfOne = 0;
        int numberOfTwo = 0;

        for (int i = 0; i < numberOfLaunch; i++) {
            rand = random.nextInt(2) + 1;
            if(rand == 1) {
                numberOfOne++;
            }
            else if(rand == 2) {
                numberOfTwo++;
            }
        }

        System.out.println("Pile : " + numberOfOne);
        System.out.println("Face : " + numberOfTwo);
    }
}
