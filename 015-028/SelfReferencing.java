/**
 * This class is used to test self referencing
 * @author: engineerphoenix
 */

public class SelfReferencing{
  void tester(SelfReferencing r) {
    System.out.println("testing self referencing " + r + " in java");
  }

  public void reference() {
    System.out.println("calling self referencing in java");
    tester(this);
  }

  public static void main(String... args) {
    SelfReferencing r = new SelfReferencing();
    //r.reference(this); //not gonna word cos main is static
    r.reference(); 
  }
}
