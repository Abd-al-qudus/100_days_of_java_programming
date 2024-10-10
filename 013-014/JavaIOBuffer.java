/**
 * this class takes care of basic input and output
 * its worth to take care of buffer overflow
 * @author: engineerphoenix
 */

import java.util.Scanner;


public class JavaIOBuffer {
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your first name: ");
    String first = scanner.nextLine(); // works with carriage return
    System.out.print("Enter your last name: ");
    String last = scanner.nextLine();
    System.out.print("Enter your Age: ");
    int age = scanner.nextInt();
    scanner.nextLine(); // handles buffer overflow
    System.out.print("Enter your CGPA: ");
    double cgpa = Double.parseDouble(scanner.nextLine()); //handle overflow by default
    System.out.printf("welcome %s, %s. You are %d years old and have %f as your cgpa\n", first, last, age, cgpa);
  }
}
