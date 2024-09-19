/**
 * testing the encapsulation class
 * @author: engineerphoenix
 */

package encapsulation.com.phoenix;

public class Encapsulation {
  public static void main(String... args) {
    BaseClass base = new BaseClass();

    base.setName("engr", "phoenix");
    base.setAge(28);

    System.out.println(base.getAge());
    System.out.println(base.getName());
  }
}
