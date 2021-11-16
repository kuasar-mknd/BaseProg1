package ch.comem.serie1;

import java.util.Locale;
import java.util.Scanner;

/*

Veuillez écrire un programme permettant le calcul de la moyenne d'un cours dont les 
notes n'ont pas le même coefficient.
L'utilisateur saisit :
        - la note d'examen intermédiaire,     (coefficient 2)
        - la note de projet,                  (coefficient 1)
        - la note de l'examen final.          (coefficient 3)
Le programme calcule la moyenne (en fonction des coefficients) et affiche la 
moyenne du cours.

*/

public class Exercice08_Moyenne {    

    public static void main(String[] args) {
        System.out.println("Ce programme calcul la moyenne d'un étudiant.");
        
        // Constantes
        final int COEFF_FINAL = 3;
        final int COEFF_INTER = 2;
        final int COEFF_PROJET = 1;
        
        // Saisie des valeurs
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.print("Entrez la note de "
                + "l'examen final : ");
        double noteExaFinal = scanner.nextDouble();
        
        System.out.print("Entrez la note de l'examen "
                 + "intermédiaire : ");
        double noteExaInter = scanner.nextDouble();
        
        System.out.print("Entrez la note de projet : ");
        double noteProjet = scanner.nextDouble();
        double moyenne = ((noteExaFinal * COEFF_FINAL) + (noteExaInter * COEFF_INTER) +
                (noteProjet * COEFF_PROJET)) / (COEFF_FINAL + COEFF_INTER +
                COEFF_PROJET);
        
        // Calcul
        final double PRECISION = 0.1;
        double moyenneArrondie = Math.round(moyenne/PRECISION)*PRECISION; 

        // Affichage
        System.out.println("Pour un étudiant dont les notes sont "
                + "les suivantes: ");
        System.out.println("Note de l'examen final (coeff. " + COEFF_FINAL
                + "): " + noteExaFinal );
        System.out.println("Note de l'examen intermédiaire (coeff. "
                + COEFF_INTER + "): " + noteExaInter);
        System.out.println("Note de projet (coeff. " + COEFF_PROJET + "): " +
                noteProjet);
        System.out.println("Moyenne: " + moyenneArrondie);
    }
}