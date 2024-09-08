/**
 * Constuctors: are used to initialize variables in a class
 * they are called by default when a class in instantiated
 * it can be parameterized
 * constructor overloading is the same as method overloading
 * constructor chaining is for initializing overloaded constructors
 * using a single one
 * @author: engineerphoenix
 */

public class Constructors {
  int u, v;

  //default
  /*Constructors() {

  }*/

  //chain constructors
  Constructors(int a) {
    this(a, 20); // call other constructors
  }

  Constructors(int a, int b) {
    this.u = a;
    this.v = b;
  }

  private void display() {
    System.out.println("sum of instance objects: " + (this.u + this.v));
  }

  public static void main(String... args) {
    Constructors constr1 = new Constructors(2);
    constr1.display();

    /*Constructors constr2 = new Constructors();
    constr2.display();*/

    Constructors constr3 = new Constructors(3, 6);
    constr3.display();
  }
}
