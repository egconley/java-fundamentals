package basiclibrary;

import java.util.Arrays;

public class ContainsDuplicates {

    public static boolean containsDuplicates(int[] array) {
        boolean hasDuplicates = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    hasDuplicates = true;
                }
            }
        }
        System.out.println("input array: " + Arrays.toString(array) + " function result: " + hasDuplicates);
        return hasDuplicates;
    }

}
