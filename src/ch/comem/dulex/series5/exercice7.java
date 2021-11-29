package ch.comem.dulex.series5;

public class exercice7 {
    public static void main(String[] args) {
        char charSep = ',';
        double[] array = {5.5,7.6,3.1,9.2,56.4};
        System.out.println(implode(charSep, array));
    }

    private static String implode(char charSep, double[] array){
        StringBuilder output = new StringBuilder();
        for (double v : array) {
            output.append(v).append(charSep).append(" ");
        }
        return output.toString();
    }
}
