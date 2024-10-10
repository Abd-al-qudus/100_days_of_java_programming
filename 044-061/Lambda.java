/**
 * java lambda expression
 * @lambda: used with functional interfaces
 * @predicate: functional interface used for boolean test
 * every primitive data type has a boolean predicate used
 * in the boolean operation eg IntPredicate, DoublePredicate...
 * @consumer: takes in generic and does nothing, basically
 * consumes it.....
 * @Functional: can be used for functional chaining, used for
 * creating functional interface.....
 * @Supplier: generating random values
 * These are the four commonly used functional interfaces in java
 * you can have your custom interface to use with lambda
 */

import java.util.List;


@FunctionalInterface
interface Operation {
  double oper(double a, double b);
}


// consuming the interface with a named class
class ConsumerClass implements Operation {
  //using addition as example
  public double oper(double a, double b) {
    return a + b;
  }

  public double sqr(double num) {
    return num * num;
  }
}


public class Lambda {
  public static void main(String... args) {
    // using classes to consume operation
    double a = 3;
    double b = 5;
    double result = new ConsumerClass().oper(a, b);
    System.out.printf("operation result of %f and %f is %f\n", a, b, result);

    ConsumerClass ops = new ConsumerClass () {
      @Override
      public double oper(double u, double v) {
        return u * v;
      };
    };
    System.out.printf("operation result of %f and %f is %f\n", 7.0, 9.0, ops.oper(7, 9));

    //using anonymous classes
    Operation operations = new Operation() {
      @Override
      public double oper(double r, double s) {
        return r + s;
      }
    };
    System.out.printf("operation result of %f and %f is %f\n", 8.0, 10.0, operations.oper(8.0, 10.0));

    //lambda operation
    Operation newOps = (e, f) -> e + f;
    double res = newOps.oper(12, 15);
    System.out.printf("operation result of %f and %f using lambda is %f\n", 8.0, 10.0, newOps.oper(8.0, 10.0));
    System.out.printf("operation result of %f and %f using lambda is %f\n", 12.0, 15.0, res);

    List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    lst.forEach(ops::sqr);
    lst.forEach(System.out::println);
  }
}
