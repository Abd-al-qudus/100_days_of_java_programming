/**
 * This class is a test class used to perform operations
 * on a string object in java, strings are immutable objects
 * @authpr: engineerphoenix
 */

public class StringClass {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "World";

    System.out.println(s1.concat(" World"));
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.equals(s2));
    System.out.println(s1.toUpperCase());
    System.out.println(s2.toLowerCase());
    System.out.println(s2.isEmpty());
    System.out.println(s2.length());
    System.out.println(s2.replace("W", "x"));
    System.out.println(s2.concat(" Hello"));
    System.out.println(s1.contains("o"));
    System.out.println(s1.charAt(3));
    System.out.println(String.valueOf(123456789));

    // mutable strings for thread safe application with multithreading
    StringBuffer newString = new StringBuffer("Hello World");
    // stringbuilder is non thread safe and for single threaded fast application
    StringBuilder newStr = new StringBuilder("test");
    System.out.println(newString.append(" nigga"));
    System.out.println(newString.insert(5, "-"));
    System.out.println(newString.replace(0, 5, "*****"));
    System.out.println(newString.delete(0, 3));
    System.out.println(newString.reverse());
    System.out.println(newString.capacity());
  }
}
