/**
 * testing arraylist with this class
 * @author: engineerphoenix
 */

import java.util.ArrayList;

class ArrayListTest {
  public static void main(String... args) {
    ArrayList<String> names = new ArrayList<String>();
    names.add("engineer");
    names.add("phoenix");
    names.add("java");
    names.add("full stack");

    names.forEach(obj -> {
      System.out.println(obj);
    });
  }
}
