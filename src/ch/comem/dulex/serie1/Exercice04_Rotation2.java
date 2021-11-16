package ch.comem.serie1;

/*
   Déclarez une variable nommée x de type entier et initialisez-la à 1.
   Déclarez une variable nommée y de type entier et initialisez-la à 2.
   Veuillez écrire les instructions nécessaires pour échanger les valeurs des deux variables. 
   Voici ce que devra afficher le programme :
            Avant :
                        x = 1
                        y = 2
            Maintenant :
                        x = 2
                        y = 1
*/
public class Exercice04_Rotation2 {
    
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        
        System.out.println("Avant : ");
        System.out.println("     x = " + x);
        System.out.println("     y = " + y);
        
        // On sauvegarde la valeur de la variable x, car on va "l'écraser"
        int temp = x;
        // Remplace la valeur de x par la valeur de y
        x = y;
        // Remplace la valeur de y par la valeur de temp (c.à.d. du x sauvegardé)
        y = temp;
        
        System.out.println("Après : ");
        System.out.println("     x = " + x);
        System.out.println("     y = " + y);
    }
}
