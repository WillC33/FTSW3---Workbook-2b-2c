import java.util.Random;
public class Duplicates {
    public static void main(String[] args) {

        boolean duplicates = false;

        Random randomGen = new Random();

        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (randomGen.nextInt(20) + 1);
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        int[] array2 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = (randomGen.nextInt(20) + 1);
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            int compare1 = array1[i];

            for (int j = 0; j < array2.length; j++) {
                int compare2 = array2[j];

                if (compare1 == compare2) {

                    System.out.println(compare1 + " is duplicated");
                    duplicates = true;
                }
            }
        }
        if (!duplicates) {
            System.out.println("No duplicates found");
        }
    }
}
