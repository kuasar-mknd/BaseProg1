package ch.comem.m501;

import java.util.Scanner;

public class DulexSamuelProbleme2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arrayCityNames;
        int[] arrayCityDistances;
        String startCity, endCity, tempCity;
        int numberOfCity, cityOnePosition = 0, cityTwoPosition = 0, distanceBetweenCities = 0;
        boolean flag = false, sFlag = false, isAllreadyIn = false;

        System.out.print("Combien de villes voulez-vous saisir ? ");
        numberOfCity = input.nextInt();
        arrayCityNames = new String[numberOfCity];
        arrayCityDistances = new int[numberOfCity];

        for (int i = 0; i < arrayCityNames.length; i++) {
            do {
                System.out.print("Nom de la " + (i + 1) + "e gare : ");
                tempCity = input.next();
                for (String arrayCityName : arrayCityNames) {
                    if (tempCity.equals(arrayCityName)) {
                        isAllreadyIn = true;
                        break;
                    } else {
                        isAllreadyIn = false;
                    }
                }
                if (!isAllreadyIn) {
                    arrayCityNames[i] = tempCity;
                }
            } while (isAllreadyIn);
        }

        for (int i = 0; i < arrayCityNames.length - 1; i++) {
            System.out.print("Distance entre " + arrayCityNames[i] + " et " + arrayCityNames[i + 1] + " ? ");
            arrayCityDistances[i] = input.nextInt();
        }

        System.out.print("Veuillez saisir la ville de départ : ");
        startCity = input.next();
        System.out.print("Veuillez saisir la ville d'arrivée");
        endCity = input.next();

        for (int i = 0; i < arrayCityNames.length; i++) {
            if (startCity.equals(arrayCityNames[i]) && !flag) {
                cityOnePosition = i;
                flag = true;
            } else if (endCity.equals(arrayCityNames[i]) && !flag) {
                cityOnePosition = i;
                flag = true;
            } else if (startCity.equals(arrayCityNames[i]) && flag) {
                cityTwoPosition = i;
                sFlag = true;
            } else if (endCity.equals(arrayCityNames[i]) && flag) {
                cityTwoPosition = i;
                sFlag = true;
            }
        }

        for (int i = cityOnePosition; i < cityTwoPosition; i++) {
            distanceBetweenCities += arrayCityDistances[i];
        }
        if (flag && sFlag) {
            System.out.println("La distance entre " + startCity + " et " + endCity + " est de " + distanceBetweenCities + " [km]");
        } else {
            System.out.println("Ce trajet n'a pas été défini");
        }
    }
}
