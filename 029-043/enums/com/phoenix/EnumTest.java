/**
 * testing enum cases with a menu driven program
 * ordinal: get the index of the enum object
 * @author: engineerphoenix
 */

package src.com.phoenix;

import java.util.Scanner;


public class EnumTest {
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter game choice (START, STOP, CONTINUE): ");
    String input = scanner.nextLine();
    input = input.toUpperCase();
    Choices choice = null;;

    try {
      choice = Choices.valueOf(input);
    } catch (Exception e) {
      System.out.println("no valid option selected");
    } finally {
      System.out.println("selection index: " + choice.ordinal());
      switch (choice) {
        case START:
          choice.showStatus();
          break;
        case CONTINUE:
          choice.showStatus();
          break;
        case STOP:
          choice.showStatus();
          break;
      }
    }
  }
}
