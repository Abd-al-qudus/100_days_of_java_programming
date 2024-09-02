/**
 * this class is used to test java abstract, final
 * and static keyword, they are all non access
 * modifiers, java cores like volatile or synchronized
 * are used for threading
 * @author: engineerphoenix
 */

package com.phoenix;

abstract class Abstract {
  private void hello() {
    System.out.println("this is gonna work after abstraction");
  }

  abstract void test();

  static void area(double rad) {
    double area = 3.14 * rad * rad;
    System.out.println("Area is: " + area);
  }
}

class Tester extends Abstract {
  public void test() {
    System.out.println("this is test working");
  }
}

public class AbstracTest{
  public static void main(String... args) {
    Abstract.area(3.4);
    Tester tester = new Tester();
    tester.test();
  }
}
