package ch.comem.dulex;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int intChoice;


        while (true) {
            System.out.print("\n\nQuel exercice voulez-vous exécuter ? : ");
            intChoice = input.nextInt();

            switch (intChoice) {
                case 1:
                    exercice1();
                    break;
                case 2:
                    exercice2();
                    break;
                case 3:
                    exercice3();
                    break;
                case 4:
                    exercice4();
                    break;
                case 5:
                    exercice5();
                    break;
                case 6:
                    exercice6();
                    break;
                case 7:
                    exercice7();
                    break;
                case 8:
                    exercice8();
                    break;
                case 9:
                    exercice9();
                    break;
                case 10:
                    exercice10();
                    break;
                case 11:
                    exercice11();
                    break;
                default:
                    System.out.println("L'exercice n'esxiste pas ...");
            }
        }
    }

    static void exercice1() {
        int intAge = 22;
        System.out.println("\nVotre âge : " + intAge);
    }

    static void exercice2(){
        int intNombreDeTours = 3;
        double dblTempsEnMinParTour = 1.5;
        double dblTempsTotalEnMin = intNombreDeTours * dblTempsEnMinParTour;

        System.out.println("\nLe temps effectué pour les " + intNombreDeTours + " tours est de " + dblTempsTotalEnMin + " minutes.");
    }

    static void exercice3(){
        int intNombreDeTours = 3;
        double dblTempsEnMinParTour;
        double dblTempsTotalEnMin;

        intNombreDeTours++;
        dblTempsEnMinParTour = 1.5;
        dblTempsTotalEnMin = intNombreDeTours * dblTempsEnMinParTour;

        System.out.println("\nLe temps effectué pour les " + intNombreDeTours + " tours est de " + dblTempsTotalEnMin + " minutes.");
    }

    static void exercice4(){
        int intX = 1;
        int intY = 2;
        int intSaveValue;

        System.out.println("\nAvant\n\tx = " + intX + "\n\ty = " + intY);

        intSaveValue = intX;
        intX = intY;
        intY = intSaveValue;

        System.out.println("\nAprès\n\tx = " + intX + "\n\ty = " + intY);
    }

    static void exercice5(){
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

    static void exercice6(){
        Scanner input = new Scanner(System.in);
        double dblCircleSize;
        double dblSurface;
        double dblCirconferences;

        System.out.print("\nVeuillez saisir la valeur du rayon du cercle : ");

        dblCircleSize = input.nextDouble();

        dblCirconferences = 2*Math.PI*dblCircleSize;
        dblSurface = Math.PI * Math.pow(dblCircleSize, 2);

        System.out.println("La surface du cercle est de : " + dblSurface);
        System.out.println("La circonférence est de : " + dblCirconferences);
    }

    static void exercice7(){
        Scanner input = new Scanner(System.in);
        double dblRoomWidth;
        double dblRoomLenght;
        double dblRoomHeight;
        double dblRoomSurfaceFloor;
        double dblRoomSurfaceWall;

        System.out.print("\nQuel est la largeur de la pièce : ");
        dblRoomWidth = input.nextDouble();
        System.out.print("Quel est la longeur de la pièce : ");
        dblRoomLenght = input.nextDouble();
        System.out.print("Quel est la hauteur de la pièce : ");
        dblRoomHeight = input.nextDouble();

        dblRoomSurfaceFloor = dblRoomLenght*dblRoomWidth;
        dblRoomSurfaceWall = (dblRoomHeight*dblRoomLenght*2)+(dblRoomHeight*dblRoomWidth*2);

        System.out.println("La surface au sol est de " + Math.round(dblRoomSurfaceFloor*100.0)/100.0 + " [m2]");
        System.out.println("La surface des murs est de " + Math.round(dblRoomSurfaceWall*100.0)/100.0 + " [m2]");
    }

    static void exercice8(){
        Scanner input = new Scanner(System.in);
        double dblInterNote;
        double dblProjectNote;
        double dblFinalNote;
        double dblEndNote;
        int intInterNoteCoef = 2;
        int intProjectNoteCoef = 1;
        int intFinalNoteCoef = 3;

        System.out.print("\nQuel est la note de l'examen intermédiaire : ");
        dblInterNote = input.nextDouble();
        System.out.print("Quel est la note du projet : ");
        dblProjectNote = input.nextDouble();
        System.out.print("Quel est la note de l'examen final : ");
        dblFinalNote = input.nextDouble();

        dblEndNote = ((dblFinalNote * intFinalNoteCoef) + (dblInterNote * intInterNoteCoef) + (dblProjectNote * intProjectNoteCoef)) / (intFinalNoteCoef + intInterNoteCoef + intProjectNoteCoef);
        System.out.println("Votre moyenne est de " + Math.round(dblEndNote*100.0)/100.0);
    }

    static void exercice9(){
        Scanner input = new Scanner(System.in);
        int intPhotoCount;
        int intPhotoProLine;
        int intFullLine;

        System.out.print("\nCombien de photo avez-vous : ");
        intPhotoCount = input.nextInt();
        System.out.print("Combien de photo par lignes : ");
        intPhotoProLine = input.nextInt();

        intFullLine = Math.round(intPhotoCount/intPhotoProLine);
        System.out.println("Il y aura " + intFullLine + " lignes constituées de " + intPhotoProLine + " photos.");
    }

    static void exercice10(){
        Scanner input = new Scanner(System.in);
        int intPhotoCount;
        int intPhotoProLine;
        int intFullLine;
        int intLastLine;

        System.out.print("\nCombien de photo avez-vous : ");
        intPhotoCount = input.nextInt();
        System.out.print("Combien de photo par lignes : ");
        intPhotoProLine = input.nextInt();

        intFullLine = Math.round(intPhotoCount/intPhotoProLine);
        intLastLine = intPhotoCount-(intFullLine*intPhotoProLine);

        System.out.println("Il y aura " + intFullLine + " lignes constituées de " + intPhotoProLine + " photos.");
        System.out.println("Il y aura " + intLastLine + " photos sur la dernières ligne");
    }

    static void exercice11(){
        Scanner input = new Scanner(System.in);
        int intNumber;
        int intDivider;
        boolean boolResult=false;

        System.out.print("\nVeuillez saisir un nombre : ");
        intNumber = input.nextInt();
        System.out.print("Veuillez saisir un diviseur : ");
        intDivider = input.nextInt();

        boolResult = (intNumber % intDivider) == 0;

        System.out.println(intNumber + " est-il divisible par " + intDivider + " ? : " + boolResult);
    }

}
