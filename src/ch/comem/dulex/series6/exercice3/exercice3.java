package ch.comem.dulex.series6.exercice3;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class exercice3 {

    public static void main(String[] args) {

        int[][] array1 = getInts();
        int[][] array2 = getInts();
        int[][] array3 = getInts();
        int[][] array4 = getInts();
        int[][] array5 = getInts();
        int[][] array6 = getInts();

        long startTime = System.nanoTime();
        for (int[] ints : array1) {
            BubbleSort.sort(ints);
        }
        long endTime = System.nanoTime();
        long timeElapsed = (endTime - startTime)/10;
        System.out.println("Execution time in milliseconds BubbleSort: " + timeElapsed / 1000000);


        startTime = System.nanoTime();
        for (int[] ints : array2) {
            DualPivotQuickSort.sort(ints);
        }
        endTime = System.nanoTime();
        timeElapsed = (endTime - startTime)/10;
        System.out.println("Execution time in milliseconds DualPivotQuickSort: " + timeElapsed / 1000000);

        startTime = System.nanoTime();
        for (int[] ints : array3) {
            HeapSort.sort(ints);
        }
        endTime = System.nanoTime();
        timeElapsed = (endTime - startTime)/10;
        System.out.println("Execution time in milliseconds HeapSort: " + timeElapsed / 1000000);

        startTime = System.nanoTime();
        for (int[] ints : array4) {
            InsertionSort.sort(ints);
        }
        endTime = System.nanoTime();
        timeElapsed = (endTime - startTime)/10;
        System.out.println("Execution time in milliseconds InsertionSort: " + timeElapsed / 1000000);

        startTime = System.nanoTime();
        for (int[] ints : array5) {
            MergeSort.sort(ints);
        }
        endTime = System.nanoTime();
        timeElapsed = (endTime - startTime)/10;
        System.out.println("Execution time in milliseconds MergeSort: " + timeElapsed / 1000000);

        startTime = System.nanoTime();
        for (int[] ints : array6) {
            SelectionSort.sort(ints);
        }
        endTime = System.nanoTime();
        timeElapsed = (endTime - startTime)/10;
        System.out.println("Execution time in milliseconds SelectionSort: " + timeElapsed / 1000000);


    }

    private static int[][] getInts() {
        int[]   array1 = generateArray();
        int[]   array2 = generateArray();
        int[]   array3 = generateArray();
        int[]   array4 = generateArray();
        int[]   array5 = generateArray();
        int[]   array6 = generateArray();
        int[]   array7 = generateArray();
        int[]   array8 = generateArray();
        int[]   array9 = generateArray();
        int[]   array10 = generateArray();

        int[][] array = {array1,array2,array3,array4,array5,array6,array7,array8,array9,array10};
        return array;
    }

    private static int[] generateArray(){
        // generate random numbers between 0 and 100000
        int minVal = 0;
        int maxVal = 100000;

        int[] arr = new int[maxVal];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(minVal, maxVal);
        }
        return arr;
    }
}
