/**
 * this class is meant for 100% abstractio
 * interfaces: can be normal, functional
 * and marker interfaces, speed has a single implementation
 * @author: engineerphoenix
 */

package interfaces.com.phoenix;

@FunctionalInterface
interface AnonymousSingle {
  int add(int x, int y);
}


interface Movement {
  // all with public static attached by default
  // methods with public abstract
  int gears = 10;

  void speed();
  void run();
  void accelerate();

  static void accessStatic() {
    System.out.println("i am void in movement");
  }

  default void action() {
    System.out.println("do something...");
  }
}

interface Stop extends AnonymousSingle {
  void speed();
  void brake();

  private void iAmVoid() {
    System.out.println("i am private void");
  }

  default void thisIsNew() {
    iAmVoid();
    System.out.println("i am doing something new");
  }

  default void stopAct() {
    System.out.println("do something to stop car...");
  }
}


class Vehicle implements Movement, Stop, AnonymousSingle {
  //must apply runtime polymorphism

  public void speed() {
    System.out.println("vehicle can speed up");
  }

  public void run() {
    System.out.println("vehicle can run");
  }

  public void accelerate() {
    System.out.println("vehicle can accelerate");
  }

  public void brake() {
    System.out.println("vehicle can apply brake");
  }

  @Override
  public int add(int x, int y) {
    return (x + y);
  }
}


class InterfaceTest {
  public static void main(String... args) {
    // an interface cannot implement itself
    Movement mObj = new Vehicle(); // i can only access movement objects here
    System.out.println("gears: " + mObj.gears);

    Vehicle vehicle = new Vehicle();
    vehicle.speed();

    System.out.println("vehicle extension: " + vehicle.add(5, 7));
    //vehicle.accessStatic();
    vehicle.thisIsNew();
    vehicle.stopAct();
    vehicle.action();
    Movement.accessStatic();

    // lets fire up an anonymous inner class
    AnonymousSingle anons = new AnonymousSingle() {
      //@Override cannot work, must be a super
      public int add(int x, int y) {
        return (x + y);
      }
    };

    System.out.println("adding: " + anons.add(3, 5));

    //set to use lambda
    AnonymousSingle set = (x, y) -> x + y;
    System.out.println("adding: " + set.add(3, 5));
  }
}
