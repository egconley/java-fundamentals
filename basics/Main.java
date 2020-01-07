import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    // String greeting = "Welcome to my Java program.";
    // System.out.println(greeting);

    // int x = 7;
    // float f = 42.3f;
    // double d = 42.3;

    // execute the function called "loopTo" and pass 10 as a parameter
    // loopTo(10);

    // int four = 4;
    // int result = multiplyByTwo(four);
    // System.out.println(four + " doubled is " + result);

    // execute pluralize
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    // execute flipNHeads
    double rand = Math.random();
    int randInt = (int) Math.ceil(rand * 10);
    flipNHeads(randInt);

    // execute clock
    clock();
  }

  // Functions that return nothing have a return type of "void"
  // public static void loopTo(int max) {
  //   for (int i = 0; i < max; i++) {
  //     System.out.println("Loop #" + i);
  //   }
  // }

  // This function has a return type of "int"
  // public static int multiplyByTwo(int n) {
  //   return n * 2;
  // }

  // Pluraize
  public static String pluralize(String word, int number) {
    if (number > 1 == true) {
      word += "s";
    }
    return word;
  }

  // Flipping Coins
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
      // System.out.println(flips);
      // System.out.println(coinResult);
    }
    //System.out.println(n);
    //System.out.println(count);
    System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");
  }

  // Command Line Clock
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
  
}