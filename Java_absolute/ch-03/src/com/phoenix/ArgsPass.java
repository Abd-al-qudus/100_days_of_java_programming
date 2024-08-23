/**
 * passing arguments from the cl
 */

public class ArgsPass {
  public static void main(String... args) {
    for (String arg: args) {
      System.out.println(arg);
    }
  }
}
