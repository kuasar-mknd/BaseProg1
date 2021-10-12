package ch.comem.dulex.series1;

import java.util.Scanner;


public class series1 {

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
                default -> System.out.println("L'exercice n'esxiste pas ...");
            }
        }
    }

    static void exercice1() {
        int intAge = 22;
        System.out.println("\nVotre âge : " + intAge);
    }

    static void exercice2() {
        int intNombreDeTours = 3;
        float fltTempsEnMinParTour = 1.5F;
        float fltTempsTotalEnMin = intNombreDeTours * fltTempsEnMinParTour;

        System.out.println("\nLe temps effectué pour les " + intNombreDeTours + " tours est de " + fltTempsTotalEnMin + " minutes.");
    }

    static void exercice3() {
        int intNombreDeTours = 3;
        float fltTempsEnMinParTour;
        float fltTempsTotalEnMin;

        intNombreDeTours++;
        fltTempsEnMinParTour = 1.5F;
        fltTempsTotalEnMin = intNombreDeTours * fltTempsEnMinParTour;

        System.out.println("\nLe temps effectué pour les " + intNombreDeTours + " tours est de " + fltTempsTotalEnMin + " minutes.");
    }

    static void exercice4() {
        int intX = 1;
        int intY = 2;
        int intSaveValue;

        System.out.println("\nAvant\n\tx = " + intX + "\n\ty = " + intY);

        intSaveValue = intX;
        intX = intY;
        intY = intSaveValue;

        System.out.println("\nAprès\n\tx = " + intX + "\n\ty = " + intY);
    }

    static void exercice5() {
        int intX = 1;
        int intY = 2;
        int intZ = 3;
        int intSaveValue;

        System.out.println("\nAvant\n\tx = " + intX + "\n\ty = " + intY + "\n\tz = " + intZ);

        intSaveValue = intX;
        intX = intY;
        intY = intZ;
        intZ = intSaveValue;

        System.out.println("\nAprès\n\tx = " + intX + "\n\ty = " + intY + "\n\tz = " + intZ);
    }

    static void exercice6() {
        Scanner input = new Scanner(System.in);
        float fltCircleSize;
        float fltSurface;
        float fltCirconferences;

        System.out.print("\nVeuillez saisir la valeur du rayon du cercle : ");

        fltCircleSize = input.nextFloat();

        fltCirconferences = (float) (2 * Math.PI * fltCircleSize);
        fltSurface = (float) (Math.PI * Math.pow(fltCircleSize, 2));

        System.out.println("La surface du cercle est de : " + fltSurface);
        System.out.println("La circonférence est de : " + fltCirconferences);
    }

    static void exercice7() {
        Scanner input = new Scanner(System.in);
        float fltRoomWidth;
        float fltRoomLenght;
        float fltRoomHeight;
        float fltRoomSurfaceFloor;
        float fltRoomSurfaceWall;

        System.out.print("\nQuel est la largeur de la pièce : ");
        fltRoomWidth = input.nextFloat();
        System.out.print("Quel est la longeur de la pièce : ");
        fltRoomLenght = input.nextFloat();
        System.out.print("Quel est la hauteur de la pièce : ");
        fltRoomHeight = input.nextFloat();

        fltRoomSurfaceFloor = fltRoomLenght * fltRoomWidth;
        fltRoomSurfaceWall = (fltRoomHeight * fltRoomLenght * 2) + (fltRoomHeight * fltRoomWidth * 2);

        System.out.println("La surface au sol est de " + Math.round(fltRoomSurfaceFloor * 100.0) / 100.0 + " [m2]");
        System.out.println("La surface des murs est de " + Math.round(fltRoomSurfaceWall * 100.0) / 100.0 + " [m2]");
    }

    static void exercice8() {
        Scanner input = new Scanner(System.in);
        float fltInterNote;
        float fltProjectNote;
        float fltFinalNote;
        float fltEndNote;
        int intInterNoteCoef = 2;
        int intProjectNoteCoef = 1;
        int intFinalNoteCoef = 3;

        System.out.print("\nQuel est la note de l'examen intermédiaire : ");
        fltInterNote = input.nextFloat();
        System.out.print("Quel est la note du projet : ");
        fltProjectNote = input.nextFloat();
        System.out.print("Quel est la note de l'examen final : ");
        fltFinalNote = input.nextFloat();

        fltEndNote = ((fltFinalNote * intFinalNoteCoef) + (fltInterNote * intInterNoteCoef) + (fltProjectNote * intProjectNoteCoef)) / (intFinalNoteCoef + intInterNoteCoef + intProjectNoteCoef);
        System.out.println("Votre moyenne est de " + Math.round(fltEndNote * 100.0) / 100.0);
    }

    static void exercice9() {
        Scanner input = new Scanner(System.in);
        int intPhotoCount;
        int intPhotoProLine;
        int intFullLine;

        System.out.print("\nCombien de photo avez-vous : ");
        intPhotoCount = input.nextInt();
        System.out.print("Combien de photo par lignes : ");
        intPhotoProLine = input.nextInt();

        intFullLine = Math.round(intPhotoCount / intPhotoProLine);
        System.out.println("Il y aura " + intFullLine + " lignes constituées de " + intPhotoProLine + " photos.");
    }

    static void exercice10() {
        Scanner input = new Scanner(System.in);
        int intPhotoCount;
        int intPhotoProLine;
        int intFullLine;
        int intLastLine;

        System.out.print("\nCombien de photo avez-vous : ");
        intPhotoCount = input.nextInt();
        System.out.print("Combien de photo par lignes : ");
        intPhotoProLine = input.nextInt();

        intFullLine = Math.round(intPhotoCount / intPhotoProLine);
        intLastLine = intPhotoCount - (intFullLine * intPhotoProLine);

        System.out.println("Il y aura " + intFullLine + " lignes constituées de " + intPhotoProLine + " photos.");
        System.out.println("Il y aura " + intLastLine + " photos sur la dernières ligne");
    }

    static void exercice11() {
        Scanner input = new Scanner(System.in);
        int intNumber;
        int intDivider;
        boolean boolResult;

        System.out.print("\nVeuillez saisir un nombre : ");
        intNumber = input.nextInt();
        System.out.print("Veuillez saisir un diviseur : ");
        intDivider = input.nextInt();

        boolResult = (intNumber % intDivider) == 0;

        System.out.println(intNumber + " est-il divisible par " + intDivider + " ? : " + boolResult);
    }

}
