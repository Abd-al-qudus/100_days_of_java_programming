/**
 * testing compile time polymorphism
 * @author: engineerphoenix
 */

package polymorphism.com.phoenix;

class BaseClass {
  String firstName;
  String lastName;

  public BaseClass(String frs, String lst) {
    this.firstName = frs;
    this.lastName = lst;
  }

  public void welcome() {
    System.out.printf("Welcome back, %s -- %s.\n", firstName, lastName);
  }

  public void welcome(int age) {
    System.out.printf("Welcome back, %s -- %s. You are %d years old.\n", firstName, lastName, age);
  }

  public void welcome(int age, double gpa) {
    System.out.printf("Welcome back, %s -- %s. You are %d years old and have a gpa of %.2f last session.\n", firstName, lastName, age, gpa);
  }
}
