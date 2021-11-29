package ch.comem.dulex.series5;

public class exercice2 {
    public static void main(String[] args) {
        float[] numberList = {4.5F, 5.2F, 6.4F};
        float sum = 0;

        for (float v : numberList) {
            sum = addition(v, sum);
        }
        System.out.println(sum);
    }
    private static float addition(float input, float sum){
        return input + sum;
    }
}
