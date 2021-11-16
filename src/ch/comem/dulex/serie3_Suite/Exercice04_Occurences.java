package ch.comem.serie3_Suite;

public class Exercice04_Occurences {

    public static void main(String[] args) {

        System.out.println("Ce programme simule 1000 lancement d'un pièce.");
        System.out.println("Et affiche le nombre de fois que la pile ou face est sorti.");
        System.out.println("Ainsi que le nombre de fois maximum que le même côté est apparu de suite");

        int compteurPile = 0;
        int compteurFace = 0;
        boolean facePrecedente;
        int nbOccurencesConsecutivesPileMax = 0;
        int nbOccurencesConsecutivesFaceMax = 0;
        int nbOccurencesConsecutivesPile = 0;
        int nbOccurencesConsecutivesFace = 0;

        final boolean PILE = false;
        final boolean FACE = true;

        boolean face = Math.random() < .5;
        if (face == PILE) {
            compteurPile++;
        } else {
            compteurFace++;
        }
        facePrecedente = face;

        for (int nbFois = 2; nbFois <= 1000; nbFois++) {
            face = Math.random() < .5;
            if (face == PILE) {
                compteurPile++;
                if (face == facePrecedente) {
                    nbOccurencesConsecutivesPile++;
                    if (nbOccurencesConsecutivesPile > nbOccurencesConsecutivesPileMax) {
                        nbOccurencesConsecutivesPileMax = nbOccurencesConsecutivesPile;
                    }
                    nbOccurencesConsecutivesFace = 0;
                }
            } else {
                compteurFace++;
                if (face == facePrecedente) {
                    nbOccurencesConsecutivesFace++;
                    if (nbOccurencesConsecutivesFace > nbOccurencesConsecutivesFaceMax) {
                        nbOccurencesConsecutivesFaceMax = nbOccurencesConsecutivesFace;
                    }
                    nbOccurencesConsecutivesPile = 0;
                }
            }
            facePrecedente = face;
        }

        System.out.println("Nombre de fois Pile : " + compteurPile + " - " + nbOccurencesConsecutivesPileMax + " occurences consécutives au max");
        System.out.println("Nombre de fois Face : " + compteurFace + " - " + nbOccurencesConsecutivesFaceMax + " occurences consécutives au max");
    }
}
