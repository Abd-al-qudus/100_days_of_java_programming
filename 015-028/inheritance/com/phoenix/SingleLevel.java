/**
 * This class is used to demonstrate single level inheritance in java
 * @author: engineerphoenix
 */

package com.phoenix;

class Name {
  String first;
  String last;
  String middle;
}

class Inheritor extends Name {
  int id;

  void showDetails() {
    String fName = this.first + " " + this.middle + " " + this.last;
    System.out.println("Welcome: " + fName);
    System.out.println("UserId: " + this.id);
  }
}

public class SingleLevel {
  public static void main(String... args) {
    Inheritor test = new Inheritor();
    test.id = 245;
    test.first = "Phoenix";
    test.middle = "D.";
    test.last = "Engineer";

    System.out.println("These are the user details: ");
    test.showDetails();
  }
}
