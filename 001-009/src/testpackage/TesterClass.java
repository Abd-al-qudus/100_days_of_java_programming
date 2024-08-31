/**
 * This package is for testing the phoenix package
 * @author: engineerphoenix
 */

//package com.testpackage;
package com.phoenix;


public class TesterClass {
  public static void main(String... args) {
    BaseClass test = new BaseClass();
    test.defaultTest();
    test.publicTest();
    test.protectedTest(); //not gonna work
  }
}
