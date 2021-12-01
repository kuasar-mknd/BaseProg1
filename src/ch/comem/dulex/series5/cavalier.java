package ch.comem.dulex.series5;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;


public class cavalier {
    public static void main(String[] args) {
        printKnightBoard(createKnightBoard(8, 'O', '#'));
    }

    /**
     * Création du plateau de jeu du cavalier
     * @param nbCase nombre de case que le plateau doit avoir
     * @param whiteCase caractère pour les cases blanche
     * @param blackCase caractère pour les cases noire
     * @return le plateau de jeu dans un tab 2d
     */
    private static String[][] createKnightBoard(int nbCase, char whiteCase, char blackCase) {
        String[][] knightBoard = new String[nbCase + 2][nbCase + 2];
        char startCoordinateX = 'A', coordinateX = startCoordinateX;
        int coordinateY = 1;
        boolean lastWasWhite = false, lastWasBlack = false;

        for (String[] row : knightBoard)
            Arrays.fill(row, "\t\t");

        for (int j = 0; j < knightBoard.length; j++) {
            if (j != 0 && j != knightBoard.length - 1) {
                for (int i = 0; i < knightBoard.length; i++) {
                    if (i != 0 && i != knightBoard.length - 1) {
                        if (!lastWasWhite) {
                            knightBoard[j][i] = " "+ whiteCase+" ";
                            lastWasWhite = true;
                        } else {
                            knightBoard[j][i] = " "+ blackCase+" ";
                            lastWasWhite = false;
                        }

                    } else {
                        knightBoard[i][j] = " "+ j +" ";
                    }
                }
                if(nbCase%2==0){
                    lastWasWhite = !lastWasWhite;
                }
            } else {
                for (int i = 0; i < knightBoard.length; i++) {
                    if (i != 0 && i != knightBoard.length - 1) {
                        knightBoard[i][j] = "\t"+coordinateX + "\t";
                        if(coordinateX == startCoordinateX + nbCase-1){
                            coordinateX = startCoordinateX;
                        }
                        else {
                            coordinateX += 1;
                        }
                    }
                }
            }
        }
        return knightBoard;
    }

    private static void printKnightBoard(String[][] knightBoard){
        for (String[] strings : knightBoard) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
}
