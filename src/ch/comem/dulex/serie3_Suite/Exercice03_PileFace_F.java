package ch.comem.serie3_Suite;

public class Exercice03_PileFace_F {

    public static void main(String[] args) {
        
        presenteProgramme();
        
        int compteurPile = 0;
        int compteurFace = 0;
        
        final boolean PILE = false;
        final boolean FACE = true;
        
        for (int nbFois=1; nbFois<=1000; nbFois++) {
            if (lancePieceDeMonnaie() == PILE) {
                compteurPile++;
            } else {
                compteurFace++;
            }
        }
        afficheResultats(compteurPile, compteurFace);
    }
    
    public static void presenteProgramme() {
        System.out.println("Ce programme simule 1000 lancement d'un pièce.");
        System.out.println("Et affiche le nombre de fois que la pile ou face est sorti.");
    }
    
    public static boolean lancePieceDeMonnaie() {
        return Math.random()<.5;
    }
    
    public static void afficheResultats(int compteurPile, int compteurFace) {
        System.out.println("Nombre de fois Pile : " + compteurPile);
        System.out.println("Nombre de fois Face : " + compteurFace);
    }
} 