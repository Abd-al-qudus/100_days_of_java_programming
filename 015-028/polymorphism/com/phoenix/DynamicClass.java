/**
 * testing dynamic polymorphism
 * @author: engineerphoenix
 */

package polymorphism.com.phoenix;

class DynamicTest extends BaseClass {
  public DynamicTest(String frs, String lst) {
    super(frs, lst);
  }

  @Override
  public void welcome() {
    System.out.printf("Welcome: %s, testing dynamic polymorphism.\n", this.firstName);
  }

  @Override
  public void welcome(int age) {
    System.out.printf("Welcome: %s, testing dynamic polymorphism with your %d years old experience.\n", this.firstName, age);
  }

  @Override
  public void welcome(int age, double gpa) {
    System.out.printf("Welcome: %s, testing dynamic polymorphism with %d and you failed last session having %.2f gpa.\n", this.firstName, age, gpa);
  }
}


public class DynamicClass {
  public static void main(String[] args) {
    BaseClass base = new BaseClass("engineer", "phoenix");
    int age = 29;
    double gpa = 2.12f;

    base.welcome();
    base.welcome(age);
    base.welcome(age, gpa);

    DynamicTest dynamic = new DynamicTest("engr", "phoenix");
    dynamic.welcome();
    dynamic.welcome(age);
    dynamic.welcome(age, gpa);
  }
}
