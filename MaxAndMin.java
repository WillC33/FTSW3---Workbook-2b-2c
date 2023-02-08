import java.util.Random;
public class MaxAndMin {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(100) + 1);
        }

        int max = 0;
        int min = 0;

        for (int i = 0; i < array.length; i++) {


            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {

            }
        }
        System.out.println(" The maximum number is: " + max);
        System.out.println(" The minimum number is: " + min);
    }
}
