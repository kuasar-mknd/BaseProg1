package ch.comem.dulex.series6.exercice3;

import ch.comem.dulex.series6.exercice3.*;

import java.util.Arrays;

// Cette classe met en œuvre différents algorithmes de tri
public class _ProgrammeTris {

    public static void main(String[] args) {

        System.out.println("Dual Pivot Quicksort - Tri rapide");
        int tab0[] = { 9, 3, 1, 5, 13, 12 };
        System.out.println("Avant tri : " + Arrays.toString(tab0));
        DualPivotQuickSort.sort(tab0);
        System.out.println("Après tri : " + Arrays.toString(tab0));
        System.out.println();

        // Pour les détails du fonctionnement : https://fr.wikipedia.org/wiki/Tri_fusion
        System.out.println("Merge Sort - Tri par fusion");
        int tab1[] = { 9, 3, 1, 5, 13, 12 };
        System.out.println("Avant tri : " + Arrays.toString(tab1));
        MergeSort.sort(tab1);
        System.out.println("Après tri : " + Arrays.toString(tab1));
        System.out.println();

        // Pour les détails du fonctionnement : https://fr.wikipedia.org/wiki/Tri_par_tas
        System.out.println("Heap Sort - Tri par tas");
        int tab2[] = { 9, 3, 1, 5, 13, 12 };
        System.out.println("Avant tri : " + Arrays.toString(tab2));
        HeapSort.sort(tab2);
        System.out.println("Après tri : " + Arrays.toString(tab2));
        System.out.println();

        // Pour les détails du fonctionnement : https://fr.wikipedia.org/wiki/Tri_par_insertion
        System.out.println("Insertion Sort - Tri par insertion");
        int tab3[] = { 9, 3, 1, 5, 13, 12 };
        System.out.println("Avant tri : " + Arrays.toString(tab3));
        InsertionSort.sort(tab3);
        System.out.println("Après tri : " + Arrays.toString(tab3));
        System.out.println();

        // Pour les détails du fonctionnement : https://fr.wikipedia.org/wiki/Tri_par_sélelection
        System.out.println("Selection Sort - Tri par séléction");
        int tab4[] = { 9, 3, 1, 5, 13, 12 };
        System.out.println("Avant tri : " + Arrays.toString(tab4));
        SelectionSort.sort(tab4);
        System.out.println("Après tri : " + Arrays.toString(tab4));
        System.out.println();

        // Pour les détails du fonctionnement : https://fr.wikipedia.org/wiki/Tri_à_bulles
        System.out.println("Bubble Sort - Tri à bulles");
        int tab5[] = { 9, 3, 1, 5, 13, 12 };
        System.out.println("Avant tri : " + Arrays.toString(tab5));
        BubbleSort.sort(tab5);
        System.out.println("Après tri : " + Arrays.toString(tab5));
        System.out.println();
    }
}