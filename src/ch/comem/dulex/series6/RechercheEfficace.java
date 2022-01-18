package ch.comem;

public class RechercheEfficace {

    /**
     * Attention ! Ne fonctionne que si les valeurs du tableau sont triées par ordre croissant
     * @param arr   Le tableau
     * @param value La valeur à chercher
     * @return true si la valeur est dans le tableau, false sinon
     */
    public static boolean contains(int[] arr, int value) {
        return indexOf(arr, value) != -1;
    }

    /**
     * Attention ! Ne fonctionne que si les valeurs du tableau sont triées par ordre croissant
     * @param arr   Le tableau
     * @param value La valeur à chercher
     * @return L'index de la (première) case valant "value" ou -1 si value n'a pas été trouvée
     */
    public static int indexOf(int[] arr, int value) {
        int index = -1;
        int start = 0; // Démarrer l'indice
        int end = arr.length - 1; // Indice final
        boolean stop = false;
        int mid;
        do {
            mid = (start + end) / 2;
            if (arr[mid] > value) {
                end = mid - 1;
            } else if (arr[mid] < value) {
                start = mid + 1;
            } else {
                stop = true;
                index = mid;
            }
        } while (start <= end && !stop);
        return index;
    }

    public static void main(String[] args) {
        int[] tab = {1, 2};
        System.out.println(indexOf(tab, 2));
    }
}