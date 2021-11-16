package ch.comem.serie1;

/*
   Déclarez une variable nommée nombreDeTours de type entier et initialisez-la à 3.
   Déclarez une variable nommée tempsEnMinParTour de type réelle et initialisez-la à 1.5.
   Déclarez une variable nommée tempsTotalEnMin de type réelle et initialisez-la avec 
   la valeur du temps total mis pour effectuer le nombre de tours défini précédemment et 
   affichez le résultat sous la forme  : 
     Le temps effectué pour les 3 tours est de 4.5 minutes.
 */
public class Exercice02_Tour {

    public static void main(String[] args) {
        int nombreDeTours = 3;
        double tempsEnMinParTour = 1.5;
        double tempsTotalEnMin = nombreDeTours * tempsEnMinParTour;
        System.out.println("Le temps effectué pour les "
                + nombreDeTours + " tours est de " + tempsTotalEnMin + " minutes.");
    }

}
