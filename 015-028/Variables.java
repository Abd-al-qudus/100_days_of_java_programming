/**
 * this is used to address variables in java programming
 * Class: denotes the state and behavior of the object
 * Object: denotes the instance containing variables and methods
 * Attribute: property of an object /built in or userdef
 * Static variables: exist as a single field
 * Instance variable: instances values accessed with this keyword
 * Local variables: defined between methods
 */

public class Variables {
  static String name = "myName";
  int counter = 40;

  private int add(int num){
    int test = 10;
    return this.counter + num + test;
  }

  public static void main(String... args) {
    int a = 25;
    Variables tester = new Variables();
    System.out.println(tester.add(a));
  }
}
