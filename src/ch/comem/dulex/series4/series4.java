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

    static void exercice4(){
        String[] arrayName = {"Aline", "Roger", "Julia", "Steven", "Jules"};

        System.out.println("Avant : " + Arrays.asList(arrayName));
        Collections.reverse(Arrays.asList(arrayName));
        System.out.println("Après : " + Arrays.asList(arrayName));
    }

    static void exercice5(){
        Float[] arrayTemp = {0.7F,2F,5.5F,9F,13F,16.3F,18.1F,17.6F,14.8F,10.1F,5F,2.3F};
        Float[] arrayTempDeviate = new Float[arrayTemp.length];

        Float tempMax, tempMin, tempAverage, tempExtend, tempDeviate, tempSum, tempDeviateSum;
        tempMax=0F;
        tempMin=0F;
        tempSum=0F;
        tempDeviateSum=0F;

        Arrays.sort(arrayTemp);
        tempMax=arrayTemp[arrayTemp.length-1];
        tempMin=arrayTemp[0];

        for (Float aFloat : arrayTemp) {
            tempSum += aFloat;
        }

        tempAverage = tempSum / arrayTemp.length;

        tempExtend = tempMax-tempMin;

        for (int i =0; i<arrayTemp.length;i++){
            arrayTempDeviate[i] = Math.abs(arrayTemp[i]-tempAverage);
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

    static void exercice6(){
        Integer[] arrayRandom = new Integer[100];
        Integer[] counterIterator =  new Integer[10];
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

    static void exercice7(){
        
    }
}
