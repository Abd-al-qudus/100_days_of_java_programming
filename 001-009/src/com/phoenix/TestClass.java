/**
 * this class test the method in Baseclass in package level
 * @author: engineerphoenix
 */

package com.phoenix;

public class TestClass {
  public static void main(String[] args) {
    BaseClass testClass = new BaseClass();
    testClass.defaultTest(); // gonna work
    testClass.publicTest(); // gonna work
    testClass.protectedTest(); // gonna work
    //testClass.privateTest(); // not gonna work
  }
}
