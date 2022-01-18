package ch.comem.dulex.series6;

public class exercice1 {
    public static void main(String[] args) {
        int[] tab = {1, 2,3,4,5,6,7,8,9,10};

        System.out.println(indexOf(tab, 0));


    }

    private static boolean indexOf(int[] tab, int value){
        boolean found = false, flag = true;
        int index = tab.length/2, oldIndex = 0;

        do {
            if (index == tab.length-1 || index == 0) {
                flag = false;
            }

            if (tab[index] == value) {
                found = true;
                flag = false;
            } else if (tab[index] > value) {
                index = (index-oldIndex) / 2 + oldIndex;
            } else if (tab[index] < value) {
                oldIndex = index;
                index = ((tab.length - oldIndex) / 2) + oldIndex;
            }


        }while (flag);


        return found;
    }
}
