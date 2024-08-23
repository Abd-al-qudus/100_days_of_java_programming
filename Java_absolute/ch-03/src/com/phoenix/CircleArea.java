/**
 * compute the area of a circle
 * a static function can be used without class instantiation
 */

//java import
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

// this is a java comment
public class CircleArea {
  public static void main(String... args) {
    double radius = 5.225;
    double area = PI * radius * radius;
    System.out.println("Area of the circle: " + area);
    System.out.println("Square root of the area is : " + sqrt(area));
  }
}
