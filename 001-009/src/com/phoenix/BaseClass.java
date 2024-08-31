/**
 * this class is meant for testing access modifiers in java
 * there are four access modifiers in java
 * - private: can be seen with the class
 * - public: can be seen everywhere in class and other packages
 * - protected: within the package and subclass
 * - default: default mode in java
 * @author: engineerphoenix
 */

package com.phoenix;

public class BaseClass {

  public void publicTest() {
    System.out.println("PUBLIC, I can be seen everywhere");
  }

  private void privateTest() {
    System.out.println("PRIVATE, I can be seen here");
  }

  void defaultTest() {
    System.out.println("DEFAULT, I can be seen in this package");
  }

  protected void protectedTest() {
    System.out.println("PROTECTED, I can be seen in this package as a whole");
  }

  public static void main(String... args) {
    System.out.println("Hello, this is main");
  }
}
