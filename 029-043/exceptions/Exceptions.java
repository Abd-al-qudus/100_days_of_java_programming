/**
 * exceptions in java. exception class is a subclass
 * of throwable, meaning all exceptions can be thrown
 * both exception and error inherit from throwable base
 * the major diifference between exception and error is
 * that exception can be controlled to continue thread
 * execution at runtime while error terminates the thread
 * exception has a higher heirachy to checked and unchecked
 * exceptions depending on the execution of the thread
 * @author: engineerphoenix
 */


@FunctionalInterface
interface Oper {
  int operation(int a, int b);
}

class PhoenixException extends Exception {
  public PhoenixException(String message) {
    super(message);
  }

  @Override
  public String toString() {
    return "A phoenix exception occurred";
  }
}


public class Exceptions {

  static void createException {
    throw new Exception();
  }

  public static void main(String... args) {
    int a = 58;
    int b = 1;
    int result = 0;

    Oper ops = (u, v) -> u / v;

    try {
      result = ops.operation(a, b);
      Integer.parseInt("12hello34");
    } catch (ArithmeticException e) {
      System.out.println("Exception: " + e.getMessage() + " occured");
    } catch (NumberFormatException e) {
      System.out.println("Exception: " + e.getMessage() + " occured");
    } catch (Exception e) {
      System.out.println("An Exception occured");
    } finally {
      System.out.println("result is: " + result);
    }

    try {
      throw new PhoenixException("Phoenix created a strange exception");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
