/**
 * testing encapsulation with base class
 * @author: engineerphoenix
 */

package encapsulation.com.phoenix;


public class BaseClass {
  private String fullName;
  private int age;

  public void setName(String first, String last) {
    fullName = first + " " + last;
  }

  public String getName() {
    return fullName;
  }

  public void setAge(int ag) {
    age = ag;
  }

  public int getAge() {
    return age;
  }
}
