/**
 * This package is for testing the phoenix package
 * @author: engineerphoenix
 */

//package com.testpackage;
package com.phoenix;

import com.phoenix.BaseClass;

public class TesterClass {
  public static void main(String... args) {
    BaseClass test = new BaseClass();
    // test.defaultTest();
    test.publicTest();
    // test.protectedTest(); //not gonna work
  }
}
