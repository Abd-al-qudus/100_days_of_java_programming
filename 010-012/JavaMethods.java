/**
 * java methods and method overload
 * @author: engineerphoenix
 */

public class JavaMethods {
  int sum(int x, int y) {
    return(x + y);
  }

  int subtract(int x, int y) {
    return(x - y);
  }

  double divide(int x, int y) {
    return(x / y);
  }

  int multiply(int x, int y) {
    return(x * y);
  }

  void welcome(String name) {
    System.out.println("Welcome:(mr/mrs) " + name);
  }

  String fullName(String first, String last, String middle) {
    return(last.toUpperCase() + ", " + first + " " + middle);
  }

  //method overloading
  int sum(int... args) {
    int sum = 0;

    for(int i = 0; i < args.length; i++) {
      sum += args[i];
    }
    return (sum);
  }

  double multiply(double... args) {
    double mul = 1.00;

    for(double i: args) {
      mul *= i;
    }
    return (mul);
  }

  public static void main(String... args) {
    int x = 20;
    int y = 15;

    JavaMethods calc = new JavaMethods();
    int resAdd = calc.sum(x, y);
    int resSubtract = calc.subtract(x, y);
    double resDivide = calc.divide(x, y);
    int resMulti = calc.multiply(x, y);
    System.out.println("add x and y: " + resAdd);
    System.out.println("subtract x and y: " + resSubtract);
    System.out.println("divide x and y: " + resDivide);
    System.out.println("multiply x and y: " + resMulti);

    int result = calc.sum(1,2,3,4,5,6);
    System.out.println("List sum: " + result);

    double resultMul = calc.multiply(1,2,3,4,5,6);
    System.out.println("List multiply: " + resultMul);

    String name = calc.fullName("Phoenix", "Engineer", "01");
    System.out.println("My names are: " + name);
    calc.welcome(name);
  }
}
