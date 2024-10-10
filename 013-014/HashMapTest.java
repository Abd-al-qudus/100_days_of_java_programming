/**
 * java hash map like python kv pairs
 * @author: engineerphoenix
 */

import java.util.HashMap;

public class HashMapTest {
  public static void main(String... args) {
    HashMap<String, Integer> examInfo = new HashMap<String, Integer>();
    examInfo.put("ajani", 70);
    examInfo.put("lambda", 90);
    examInfo.put("phoenix", 99);
    examInfo.put("amar", 80);
    examInfo.put("adelana", 80);
    examInfo.putIfAbsent("deveraux", 99);

    System.out.printf("deveraux: %d\n", examInfo.get("deveraux"));
    examInfo.replace("deveraux", 100);
    System.out.printf("deveraux after: %d\n", examInfo.get("deveraux"));
    examInfo.remove("adelana");

    System.out.println(examInfo.containsKey("adelana"));
    System.out.println(examInfo.containsValue(100));
    System.out.println(examInfo);
    // .clear() deletes the content of the map
  }
}
