package basiclibrary;

import java.util.Arrays;

public class ArrayOfArrays {

    public static void main (String[] args) {
        // execute arrayAverage
        int[][] testArray = new int[][]{
                {1, 2, 3},
                {34, 45, 67},
                {-3, -5, 10}
        };

        lowestArrayAverage(testArray);
    }

    public static int[] lowestArrayAverage(int[][] array) {
        double referenceAvg = 0;
        double innerArrayAvg = 0;
        int lowestArrayAvgIndex = 0;

        for (int i=0; i < array.length; i++) {

            System.out.println(Arrays.toString(array[i]));
            double sum = 0;

            for (int j=0; j < array[i].length; j++) {
                sum += array[i][j];
            }

            innerArrayAvg = sum/array[i].length;

            System.out.println("inner average: " + innerArrayAvg);

            if (i==0) {
                referenceAvg = innerArrayAvg;
                System.out.println("ref average at i == " + i + ": " + innerArrayAvg);
            } else if (innerArrayAvg < referenceAvg) {
                referenceAvg = innerArrayAvg;
                lowestArrayAvgIndex = i;
                System.out.println("inner average at i == " + i + ": " + innerArrayAvg);
                System.out.println("ref average at i == " + i + ": " + referenceAvg);
            }

            System.out.println("lowest average: " + referenceAvg);
        }

        System.out.println("winner: " + Arrays.toString(array[lowestArrayAvgIndex]));
        return array[lowestArrayAvgIndex];
    }
}
