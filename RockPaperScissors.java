/*
* The RockPaperScissors program lets you play the famous game against
* a computer
* @author  Cameron Teed
* @version 1.0
* @since   2020-05-09
*/

// Import the Scanner class
import java.util.Scanner;

final class RockPaperScissors {

  private RockPaperScissors() {
    // Prevent instantiation
    // Optional: throw an exception e.g. AssertionError
    // if this ever *is* called
    throw new IllegalStateException("Cannot be instantiated");
  }

  /**
  * The max range for the computer generated number.
  */
  public static final int MAXRANGE = 3;
  /**
  * Function which determiens the result.
  *
  * @param userStr
  * @return resultd
  */
  static String finalOutcome(final String userStr) {

    // Creates random number 1-3
    final int randomInt = (int) (Math.random() * MAXRANGE + 1);
    // Creates varaibles for the result and compuer number
    String results;
    String computerStr;

    // Converting the computers choice from int to a string.
    if (randomInt == 1) {
      computerStr = "ROCK";
    } else if (randomInt == 2) {
      computerStr = "PAPER";
    } else {
      computerStr = "SCISSORS";
    }

    // Outputs what the computer chose
    System.out.println();
    System.out.println("Computer chose " + computerStr);

    // Determines the result of what the user and computer chose
    if (computerStr.equals(userStr)) {
      // User ties
      results = "Tied";
    } else if (computerStr.equals("PAPER") && userStr.equals("SCISSORS")) {
      // User wins
      results = "Won";
    } else if (computerStr.equals("SCISSORS") && userStr.equals("ROCK")) {
      // User Wins
      results = "Won";
    } else if (computerStr.equals("ROCK") && userStr.equals("PAPER")) {
      // User wins
      results = "Won";
    } else {
      // User losses
      results = "Lost";
    }

    // Returns the results
    return results;
  }

  /*
  * This function gets the user input and outputs it
  *
  * @param args
  */
  public static void main(final String[] args) {
    try {
      //Getting the rock, paper, or scissors from user.
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter Rock, Paper or Scissors: ");
      String userStr = scan.nextLine();
      // Converts it to uppercase
      userStr = userStr.toUpperCase();

      // Making sure the user inputs the right input.
      if (userStr.equals("ROCK") || userStr.equals("PAPER")
          || userStr.equals("SCISSORS")) {

        // Determining if they won or not.
        String results = finalOutcome(userStr);

        // Outputing the result.
        System.out.println("You " + results + "!");
        System.out.println();
        System.out.println("Done");

      } else {
        // Asks user to input correct input
        System.out.println("Please enter Rock, Paper, or Scissors.");
      }

    } catch (Exception e) {
      System.out.println("ERROR: Invalid Input");
    }
  }
}
