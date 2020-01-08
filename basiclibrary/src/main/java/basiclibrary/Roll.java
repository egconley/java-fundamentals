package basiclibrary;

public class Roll {
    public static int[] roll(int n) {
        int[] rollsArray = new int[n];
        for (int i=0; i < n; i++) {
            int min = 1;
            int max = 6;
            int randRoll = min + (int)(Math.random() * ((max - min) + 1));
            System.out.println(randRoll);
            rollsArray[i] = randRoll;
        }
        return rollsArray;
    }
}
