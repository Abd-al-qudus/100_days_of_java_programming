/**
 * enum use case for user driven programs
 * enums are essential for menu driven programs
 * they are just like classes and can have constructor
 * and method, can be private or default. Objects are
 * like instance variables instanciated as objects
 * @author: engineerphoenix
 */

package src.com.phoenix;

public enum Choices {
  START("Game started"),
  STOP("Game stopped"),
  CONTINUE("Game resumed");

  private String status;

  Choices(String stats) {
    status = stats;
  }

  void showStatus() {
    System.out.println(status);
  }
}
