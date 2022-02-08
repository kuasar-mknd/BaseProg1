package ch.comem.dulex.series5;

public class exercice5 {
    public static void main(String[] args) {
        String input = "PAUL";
        System.out.println(ucFirst(input));
    }

    private static String ucFirst(String input){
        input = input.toLowerCase();
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}
