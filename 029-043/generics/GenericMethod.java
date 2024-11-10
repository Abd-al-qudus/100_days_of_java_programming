/**
 * using generic in methods and constructors,
 * interfaces, subclasses and superclasses
 * @author: engineerphoenix
 */


class MethodClass<T>{
  T var1;
  T var2;

  <T>MethodClass(T a, T b) {
    this.var1 = a;
    this.var2 = b;
  }

  <T> addDynamics() {
    return this.var1 + this.var2;
  }
}


public class GenericMethod {
  public static void main(String... args) {
    Meth
  }
}
