/**
 * autoboxing: converting primitive to objects
 * unboxing: converting objects to primitive
 * integer cache: set up integer values without creating
 * a new object only for reference of -128 to 127
 * Integer, Long, Short, Float, Double extends Number: number can be base
 * @author: engineerphoenix
 */

public class BoxingTest {
  public static void main(String... args) {
    Integer x = 20; //autobox
    int y = x; //unbox

    //wrapping and unwrapping
    Integer u = Integer.valueOf(10);
    int z = u.intValue();

    //cache
    Integer c = 110;
    Integer d = 110;

    Integer e = 500;
    Integer f = 500;

    Number g = 3.45;
    Number h = 5000;

    System.out.printf("this is %b - %b\n", c==d, e==f);
    System.out.printf("this is %d - %d: %d - %d: %f - %d\n", x, y, u, z, g, h);
  }
}
