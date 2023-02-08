//THIS NEEDS TO BE MOVED TO WORKBOOK 2B REPOSITORY
import java.util.Arrays;
public class TwoDArray {
    public static void main(String[] args) {
        int[][] TwoDIntArray = {
                {5, 7},
                {43, 21}
        };

        String[][] TwoDStringArray = {
                {"Hello", "World"},
                {"Testing", "Arrays"}
        };

        System.out.println(Arrays.toString(TwoDStringArray[0]) + " " + Arrays.toString(TwoDStringArray[1]));
        TwoDIntArray[1][1] = 15;

        System.out.println(TwoDIntArray[0][0] + " " + TwoDIntArray[0][1]);
        System.out.println(TwoDIntArray[1][0] + " " + TwoDIntArray[1][1]);
        System.out.println();


        for (int i = 0; i < TwoDIntArray.length; i++) { //outer loop
            for (int j = 0; j < TwoDIntArray[i].length; j++) { //inner loop
                System.out.print(TwoDIntArray[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 0; i < TwoDStringArray.length; i++) { //outer loop
            for (int j = 0; j < TwoDStringArray[i].length; j++) { //inner loop
                System.out.print(Arrays.toString(TwoDStringArray[j]));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
