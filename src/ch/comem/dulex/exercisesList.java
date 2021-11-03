package ch.comem.dulex;


import ch.comem.dulex.series1.series1;
import ch.comem.dulex.series2.series2;
import ch.comem.dulex.series3.series3;
import ch.comem.dulex.series4.series4;

import java.util.Scanner;

public class exercisesList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int intChoice;
        boolean flag=true;


        while (flag) {
            System.out.print("\n\nQuel série voulez-vous exécuter ? : ");
            intChoice = input.nextInt();

            switch (intChoice) {
                case 1 -> series1.main(null);
                case 2 -> series2.main(null);
                case 3 -> series3.main(null);
                case 4 -> series4.main(null);
                case 0 -> flag = false;
                default -> System.out.println("L'exercice n'esxiste pas ...");
            }
        }

    }
}
