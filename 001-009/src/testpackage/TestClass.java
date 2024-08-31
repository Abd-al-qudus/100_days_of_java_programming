/**
 * This package is for testing the phoenix package
 * @author: engineerphoenix
 */

package testpackage;
import com.phoenix.BaseClass;


public class TestClass {
  public static void main(String... args) {
    BaseClass test = new BaseClass();
    //test.defaultTest();// not gonna be seen
    test.publicTest();
    //test.protectedTest(); //not gonna work
  }
}
