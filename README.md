# java-fundamentals
First several labs of Java 401

## Table of Contents
- Lab 01 
- Lab 02
- Lab 03
- [Lab 06](https://github.com/egconley/java-fundamentals/tree/master/inheritance/src/main/java/inheritance)
- [Lab 07](https://github.com/egconley/java-fundamentals/tree/master/inheritance/src/main/java/inheritance)

## Lab01

### Files
* basics
  - Main.class
  - Main.java

### Methods

#### Pluraizse - accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one
```
  public static String pluralize(String word, int number) {
    if (number > 1 == true) {
      word += "s";
    }
    return word;
  }
```
#### Flipping Coins - accepts an integer n and flips coins until n heads are flipped in a row.
```
  public static void flipNHeads(int n) {

    int headsStreakCount = 0;
    int flips = 0;
    while (headsStreakCount < n) {
      double result = Math.random();
      String coinResult;
      if (result < 0.5) {
        coinResult = "tails";
        headsStreakCount = 0;
      } else {
        coinResult = "heads";
        headsStreakCount++;
      }
      flips++;
    }

    System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");

  }
```
#### Command Line Clock - uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. 
```
  public static void clock() {
    LocalDateTime now = LocalDateTime.now();
    int hour = now.getHour();
    int minute = now.getMinute();
    int second = now.getSecond();
    String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

    while (true) {

      String newTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

      if ( !time.equals(newTime) ) {
        System.out.println("time: " + time + "new time: " + newTime);
        time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
      }

    }

  }
```

## Lab02

### Files
* basiclibrary
  - src
    - main/java/basiclibrary
      - Roll.java
      - ContainsDuplicates.java
      - Averages.java
      - ArrayOfArrays.java
    - test/java/basiclibrary
      - RollTest.java
      - ContainsDuplicatesTest.java
      - AveragesTest.java
      - ArrayOfArraysTest.java

### Methods

#### Rolling Dice - accepts an integer n, rolls a six-sided dice n times, and returns an array containing the values of the rolls.
```
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
```
#### Contains Duplicates - accepts an array of integers, returns true or false depending on whether the array contains duplicate values.
```
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

```
#### Calculating Averages - accepts an array of integers and calculates and returns the average of all the values in the array.
```
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
```
#### Arrays of Arrays - accepts an array of integer arrarys, calculates the average value for each array and returns the array with the lowest average.
```
package basiclibrary;

import java.util.Arrays;

public class ArrayOfArrays {

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
```
## Lab03
[link to code](https://github.com/egconley/java-fundamentals/tree/master/basiclibrary/linter/src)

### Files
* basiclibrary
  - linter
    - src
      - main
        - java/linter
          - App.java
        - resources
          - gates.js
      - test
        - java/linter
          - AppTest.java
        - resources
          - empty.js
          - test1.js
          - test2.js
          - test3.js

### Methods

#### Analyzing Weather Data - accepts 2-dimensional array of temperatures, finds max and min temp, returns Sting reporting high temp, low temp, plus any temperature not seen during the month.
```
public String analyzeWeatherData(int[][] data) {

        //Use the October Seattle weather data above.
        // Iterate through all of the data to find the min and max values.
        int minTemp = 500;
        int maxTemp = 0;

        // Use a HashSet of type Integer to keep track of all the unique temperatures seen.
        HashSet<Integer> temps = new HashSet<>();

        for (int i=0; i < data.length; i++) {
            for (int j=0; j < data[i].length; j++) {

                temps.add(data[i][j]);

                if (data[i][j] > maxTemp) {
                    maxTemp = data[i][j];
                }
                if (data[i][j] < minTemp) {
                    minTemp = data[i][j];
                }
            }
        }

        //System.out.println("High: " + maxTemp);
        //System.out.println("Low: " + minTemp);

        String returnString = "High: " + maxTemp + "\n" + "Low: " + minTemp + "\n";

        // Finally, iterate from the min temp to the max temp and
        // create a String containing any temperature not seen during the month.
        for (int i=minTemp; i<=maxTemp; i++) {
            if (!temps.contains(i)) {
                //System.out.println("Never saw temperature: " + i);
                returnString += "Never saw temperature: " + i + "\n";
            }
        }

        // Return that String.
        return returnString;
    }
```
#### Tallying Election - accepts a List of Strings representing votes and returns one string to show what got the most votes.
```
public static String tally(List<String> votes) {
        String winner = "test";
        HashMap<String, Integer> votesByCandidate = new HashMap<>();
        int maxVotes = 0;

        for (String candidate : votes) {
            if (votesByCandidate.containsKey(candidate)) {
                votesByCandidate.put(candidate, votesByCandidate.get(candidate) + 1);
                if (votesByCandidate.get(candidate) > maxVotes) {
                    maxVotes = votesByCandidate.get(candidate);
                    winner = candidate;

                    //System.out.println("current winner = " + winner + " with " + maxVotes + " votes.");
                }
            } else {
                votesByCandidate.put(candidate, 1);
            }
            //System.out.println("votesByCandidate.get(candidate) = " + votesByCandidate.get(candidate));
        }
        //System.out.println(votesByCandidate);

        return winner;
    }
```
#### JavaScript Linter - Scans through javascript file to check if semi-colons are included at the end of lines, where appropriate
```
public static int linter(String path) {
        int lineNumber = 1;
        int totalErrors = 0;
        Scanner gatesScanner;

        //https://stackoverflow.com/questions/15183761/how-to-check-the-end-of-line-using-scanner/15183769
        try {
            gatesScanner = new Scanner(new File(path));

            while (gatesScanner.hasNextLine()) {
                boolean isMissingSemiColon = false;
                String line = gatesScanner.nextLine();

                Scanner lineScanner = new Scanner(line);
                while (lineScanner.hasNext()) {
                    String token = lineScanner.next();

                    //System.out.print(token + " ");
                    if (token.contains("{")
                            || token.contains("}")
                            || token.contains("if")
                            || token.contains("else")
                            || token.contains(";")) {
                        //System.out.println("Line " + lineNumber + " is fine.");
                        isMissingSemiColon = false;
                        continue;
                    } else {
                        isMissingSemiColon = true;
                    }
                }
                if (isMissingSemiColon==true) {
                    System.out.println("Line " + lineNumber + ": Missing semicolon.");
                    totalErrors++;
                }
                //System.out.println("End of line " + lineNumber);
                lineScanner.close();
                lineNumber ++;
            }
            gatesScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(totalErrors);
        return totalErrors;
    }
```
## Lab06
[link to code](https://github.com/egconley/java-fundamentals/tree/master/inheritance)

### Files
* inheritance
   - src
     - main/java/inheritance
        - Library.java
        - Restaurant.java
        - Review.java
     - test/java/inheritance
        - LibraryTest.java
        - RestaurantTest.java
        - ReviewTest.java

## Lab07
[link to code](https://github.com/egconley/java-fundamentals/tree/master/inheritance)

### Files
* inheritance
   - src
     - main/java/inheritance
        - Library.java
        - Restaurant.java
        - RestaurantReview.java
        - Review.java
        - Reviewable.java
        - Shop.java
        - Theater.java
     - test/java/inheritance
        - LibraryTest.java
        - RestaurantTest.java
        - ReviewTest.java
        - ShopTest.java
