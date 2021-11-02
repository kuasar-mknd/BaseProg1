package ch.comem.dulex.series4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
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
                case 4 -> exercice4();
                case 5 -> exercice5();
                case 6 -> exercice6();
                case 7 -> exercice7();
                case 8 -> exercice8();
                case 9 -> exercice9();
                default -> System.out.println("L'exercice n'esxiste pas ...");
            }
        }
    }

    static void exercice1() {
        int[] arrayToInverse = {5, 2, 5, 8, 9, 10};

        for (int i = arrayToInverse.length - 1; i >= 0; i--) {
            System.out.println(arrayToInverse[i]);
        }
    }

    static void exercice2() {
        Integer[] arrayToInverse = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Avant : " + Arrays.asList(arrayToInverse));
        Collections.reverse(Arrays.asList(arrayToInverse));
        System.out.println("Après : " + Arrays.asList(arrayToInverse));
    }

    static void exercice3() {
        Scanner input = new Scanner(System.in);

        String[] arrayName = {"Aline", "Roger", "Julia", "Steven", "Jules"};
        boolean flag = false;
        String target;

        System.out.print("Veuillez saisir un prénom : ");
        target = input.next();
        for (int i = 0; i < arrayName.length; i++) {
            if (target.equals(arrayName[i])) {
                System.out.println(target + " se trouve en " + (i + 1) + "e position dans la file");
                flag = true;
            }
        }
        if (!flag) {
            System.out.println(target + " ne se trouve pas dans la file");
        }
    }

    static void exercice4() {
        String[] arrayName = {"Aline", "Roger", "Julia", "Steven", "Jules"};

        System.out.println("Avant : " + Arrays.asList(arrayName));

        for (int i = 0; i < arrayName.length - 1; i++) {
            int j;
            String last;
            last = arrayName[arrayName.length - 1];

            for (j = arrayName.length - 1; j > 0; j--) {
                arrayName[j] = arrayName[j - 1];
            }
            arrayName[0] = last;
        }

        System.out.println("Après : " + Arrays.asList(arrayName));
    }

    static void exercice5() {
        Float[] arrayTemp = {0.7F, 2F, 5.5F, 9F, 13F, 16.3F, 18.1F, 17.6F, 14.8F, 10.1F, 5F, 2.3F};
        Float[] arrayTempDeviate = new Float[arrayTemp.length];

        Float tempMax, tempMin, tempAverage, tempExtend, tempDeviate, tempSum, tempDeviateSum;
        tempMax = 0F;
        tempMin = 0F;
        tempSum = 0F;
        tempDeviateSum = 0F;

        Arrays.sort(arrayTemp);
        tempMax = arrayTemp[arrayTemp.length - 1];
        tempMin = arrayTemp[0];

        for (Float aFloat : arrayTemp) {
            tempSum += aFloat;
        }

        tempAverage = tempSum / arrayTemp.length;

        tempExtend = tempMax - tempMin;

        for (int i = 0; i < arrayTemp.length; i++) {
            arrayTempDeviate[i] = Math.abs(arrayTemp[i] - tempAverage);
        }

        for (Float aFloat : arrayTempDeviate) {
            tempDeviateSum += aFloat;
        }

        tempDeviate = tempDeviateSum / arrayTempDeviate.length;

        System.out.println("Max : " + tempMax);
        System.out.println("Min : " + tempMin);
        System.out.println("Etendue : " + tempExtend);
        System.out.println("Moyenne : " + tempAverage);
        System.out.println("Déviation moyenne : " + tempDeviate);
    }

    static void exercice6() {
        Integer[] arrayRandom = new Integer[100];
        Integer[] counterIterator = new Integer[10];
        Random randNum = new Random();

        Arrays.setAll(arrayRandom, i -> randNum.nextInt(10));
        Arrays.setAll(counterIterator, i -> 0);

        for (Integer integer : arrayRandom) {
            if (integer >= 0 && integer < counterIterator.length) {
                counterIterator[integer]++;
            }
        }

        for (int i = 0; i < counterIterator.length; i++) {
            System.out.println(i + " => " + counterIterator[i] + " occurrences");
        }

    }

    static void exercice7() {
        Scanner input = new Scanner(System.in);

        String sentence = input.nextLine();
        String[] arrayWords = sentence.split("\\W+");

        System.out.println(Arrays.asList(arrayWords));
    }

    static void exercice8() {
        int n = 12;
        int maxNote = 6;
        Integer[] arrayRandom = new Integer[n];
        Integer[] counterIterator = new Integer[maxNote + 1];
        Random randNum = new Random();

        Arrays.setAll(arrayRandom, i -> randNum.nextInt(maxNote) + 1);
        Arrays.setAll(counterIterator, i -> 0);

        for (Integer integer : arrayRandom) {
            if (integer >= 0 && integer < counterIterator.length) {
                counterIterator[integer]++;
            }
        }

        for (int i = 1; i < counterIterator.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < counterIterator[i]; j++) {
                System.out.print("X");
            }
            System.out.print("\n");
        }
    }

    static void exercice9() {
        int n = 12;
        int maxValue = 0;
        int maxNote = 6;

        Integer[] arrayRandom = new Integer[n];
        Integer[] counterIterator = new Integer[maxNote + 1];
        String[][] arrayFinal;

        Random randNum = new Random();

        Arrays.setAll(arrayRandom, i -> randNum.nextInt(maxNote) + 1);
        Arrays.setAll(counterIterator, i -> 0);

        for (Integer integer : arrayRandom) {
            if (integer >= 0 && integer < counterIterator.length) {
                counterIterator[integer]++;
            }
        }

        for (int i = 1; i < counterIterator.length; i++) {
            if (counterIterator[i] > maxValue) {
                maxValue = counterIterator[i];
            }
        }

        arrayFinal = new String[maxValue + 1][maxNote];

        for (int i = 0; i < maxNote; i++) {
            arrayFinal[maxValue][i] = Integer.toString(i + 1);
        }

        for (int i = 1; i < maxNote; i++) {
            for (int j = counterIterator[i]; j > 0; j--) {
                arrayFinal[(maxValue - j)][i - 1] = "X";
            }
        }

        for (String[] x : arrayFinal) {
            for (String y : x) {
                if (y == null) {
                    System.out.print("\t");
                } else {
                    System.out.print(y + "\t");
                }
            }
            System.out.println();
        }

    }
}
