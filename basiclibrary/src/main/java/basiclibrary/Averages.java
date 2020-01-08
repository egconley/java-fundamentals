package basiclibrary;

public class Averages {

    public static double arrayAverage(int[] array) {
        double sum = 0;
        double avg = 0;
        for (int i=0; i < array.length; i++) {
            sum += array[i];
        }
        avg = sum/(array.length);
        System.out.println("sum: " + sum);
        System.out.println("length: " + array.length);
        System.out.println("avg: " + avg);
        return avg;
    }
}
