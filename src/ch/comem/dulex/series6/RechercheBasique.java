package ch.comem;

public class RechercheBasique {
    public static boolean contains(int[] arr, int value) {
        return indexOf(arr, value) != -1;
    }

    public static int indexOf(int[] arr, int value) {
        int indexToReturn = -1;
        int index = -1;
        boolean found;
        do {
            index++;
            found = arr[index] == value;
            if (found) {
                indexToReturn = index;
            }
        } while (!found && index<arr.length-1);
        return indexToReturn;
    }

    public static void main(String[] args) {
        int[] tab = {1,2};
        System.out.println(contains(tab,3));
    }
}
