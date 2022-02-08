package ch.comem.dulex.series5;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


public class cavalier {

    private static final char knightChar = 'P';
    private static final char knightAlreadyPass = 'X';
    private static final char knightWhiteCase = 'O';
    private static final char knightBlackCase = '#';
    private static final int knightBoardCase = 50;

    public static void main(String[] args) {

        playKnight();
    }

    private static void playKnight() {
        //TODO
        String[][] knightBoard = createKnightBoard(knightBoardCase, knightWhiteCase, knightBlackCase);
        printKnightBoard(knightBoard);
        moveToNextPosition(knightBoard);
    }

    private static int[] checkNextPosition(String[][] knightBoard, String nextPosition) {
        //TODO problème liée au contain (les espaces et tab)
        char coordinateX = nextPosition.charAt(0);
        char coordinateY = nextPosition.charAt(1);
        int[] index = {0, 0};

        for (int i = 0; i < knightBoard.length; i++) {
            if (Objects.equals(knightBoard[0][i], String.valueOf(coordinateX))) {
                index[0] = i;
                break;
            }
        }
        for (int i = 0; i < knightBoard.length; i++) {
            if (Objects.equals(knightBoard[i][0], "\t" + coordinateY + "\t")) {
                index[1] = i;
                break;
            }
        }

        if (Objects.equals(knightBoard[index[0]][index[1]], String.valueOf(knightAlreadyPass)) && Objects.equals(knightBoard[index[0]][index[1]], String.valueOf(knightChar))) {
            index[0] = 0;
            index[1] = 0;
        }

        return index;
    }

    private static void moveToNextPosition(String[][] knightBoard) {
        String question = "Quel est votre prochain mouvement ? ";
        int[] nextMove;

        do {
            nextMove = checkNextPosition(knightBoard, askUserPosition(question));
        } while (nextMove[0] == 0 && nextMove[1] == 0);

        knightBoard[nextMove[0]][nextMove[1]] = String.valueOf(knightChar);
    }

    /**
     * Demande à l'utilisateur son prochain mouvement
     *
     * @param outputQuestion Texte à afficher
     * @return valeur saisie par l'utilisateur
     */
    private static String askUserPosition(String outputQuestion) {
        Scanner input = new Scanner(System.in);
        System.out.print(outputQuestion);
        return input.nextLine();
    }

    /**
     * Création du plateau de jeu du cavalier
     *
     * @param nbCase    nombre de case que le plateau doit avoir
     * @param whiteCase caractère pour les cases blanche
     * @param blackCase caractère pour les cases noire
     * @return le plateau de jeu dans un tab 2d
     */
    private static String[][] createKnightBoard(int nbCase, char whiteCase, char blackCase) {
        String[][] knightBoard = new String[nbCase + 2][nbCase + 2];
        char startCoordinateX = 'A', coordinateX = startCoordinateX;
        int coordinateY = 1;
        boolean lastWasWhite = false, lastWasBlack = false;
        int length = (int) (Math.log10(nbCase) + 1) + 1;
        StringBuilder tempCase = new StringBuilder(), tempCoordinate = new StringBuilder();

        tempCase.append(" ".repeat(Math.max(0, length)));
        tempCoordinate.append(" ".repeat(Math.max(0, length)));
        for (String[] row : knightBoard)
            Arrays.fill(row, "\t\t");

        for (int j = 0; j < knightBoard.length; j++) {
            if (j != 0 && j != knightBoard.length - 1) {
                for (int i = 0; i < knightBoard.length; i++) {
                    if (i != 0 && i != knightBoard.length - 1) {
                        if (!lastWasWhite) {
                            tempCase.replace(length - 1, length, String.valueOf(whiteCase));
                            knightBoard[j][i] = tempCase.toString();
                            lastWasWhite = true;
                        } else {
                            tempCase.replace(length - 1, length, String.valueOf(blackCase));
                            knightBoard[j][i] = tempCase.toString();
                            lastWasWhite = false;
                        }

                    } else {
                        int jLength = (int) (Math.log10(j) + 1);
                        tempCoordinate.replace(length - jLength, length, String.valueOf(j));
                        knightBoard[i][j] = tempCoordinate.toString();
                    }
                }
                if (nbCase % 2 == 0) {
                    lastWasWhite = !lastWasWhite;
                }
            } else {
                for (int i = 0; i < knightBoard.length; i++) {
                    if (i != 0 && i != knightBoard.length - 1) {
                        knightBoard[i][j] = "\t" + coordinateX + "\t";
                        if (coordinateX == startCoordinateX + nbCase - 1) {
                            coordinateX = startCoordinateX;
                        } else {
                            coordinateX += 1;
                        }
                    }
                }
            }
        }
        return knightBoard;
    }

    /**
     * Impression du plateau de jeu
     *
     * @param knightBoard Tableau contenant le jeu
     */
    private static void printKnightBoard(String[][] knightBoard) {
        for (String[] strings : knightBoard) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
}
