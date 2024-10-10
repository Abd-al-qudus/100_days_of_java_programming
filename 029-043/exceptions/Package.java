/**
 * this is for java built in packages
 * MATH: for mathematical operations
 * DecimalFormat: format numbers in decimal
 * @author: engineerphoenix
 */

import java.text.DecimalFormat;


public class Package {
  public static void main(String... args) {
    double x = 3.141528;
    double y = 2.818281828;
    DecimalFormat formatter = new DecimalFormat("#.###");
    double frmt = Double.parseDouble(formatter.format(y));
    System.out.println("formatted text: " + frmt);

    var a = Math.random();
    var b = Math.sqrt(25);
    System.out.printf("random number %.2f and square root %.2f: \n", a, b);
  }
}
