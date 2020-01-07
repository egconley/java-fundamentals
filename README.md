# java-fundamentals
First several labs of Java 401

## Files
* basics
  - Main.class
  - Main.java

## Methods

### Pluraizse - accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one
```
  public static String pluralize(String word, int number) {
    if (number > 1 == true) {
      word += "s";
    }
    return word;
  }
```
### Flipping Coins - accepts an integer n and flips coins until n heads are flipped in a row.
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
### Command Line Clock - uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. 
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
