/**
 * generics are useful in java for dyamic programming
 * Object: is the superclass of all java class thus
 * any primitive value reference with object will be
 * autoboxed to its wrapper class, but it always an
 * object. can be corrected with type casting eg
 * Object test = 5;
 * int val = (Integer) test;
 * generics are used for dynamic type referencing in
 * java programming
 */

//using an encapsulated store class

class Store<T> {
  T value;

  Store(T value) {
    this.value = value;
  }

  T getValue() {
    return this.value;
  }

  void valueClass() {
    System.out.println(this.value.getClass());
  }
}


// using an encapsulated multiple generic class
// extending number limits the generic class to
// number and any of its custom subclass
class Student<T, U extends Number, V extends Number> {
  T name;
  U score;
  V cgpa;

  Student(T name, U score, V cgpa) {
    this.name = name;
    this.score = score;
    this.cgpa = cgpa;
  }

  T getName() {
    return this.name;
  }

  U getScore() {
    return this.score;
  }

  V getCGPA() {
    return this.cgpa;
  }

  /** though not really useful in this case
   * but can be used to remove type restriction
   * though it follows the restriction of the
   * class, it can also be bounded as shown
   * upperbound - ? extends subClass
   * lowerbound - ? super superClass
  */
  void nameEquals(Student<? super String, U, V> newStudent) {
    if (this.name.equals(newStudent.name))
      System.out.println("True");
    else
      System.out.println("False");
  }

  @Override
  public String toString() {
    return "Hello: " + name + "\nScore: " + score + "\nCgpa: " + cgpa;
  }

}


//extending an interface with generic bounding
interface Actions {
  void move();
  void stop();
}


class Car implements Actions {

  @Override
  public void move() {
    System.out.println("Car is moving...");
  }

  @Override
  public void stop() {
    System.out.println("Car is stopping...");
  }

  void start() {
    System.out.println("Car is starting...");
  }
}



class Vehicle<T extends Actions>{
  T vehicle;

  Vehicle(T vhcl) {
    this.vehicle = vhcl;
  }

  void showOff() {
    this.vehicle.move();
    this.vehicle.stop();
  }

}



public class GenericTest {

  public static void main(String[] args) {
    var store = new Store<Integer>(4);
    store.valueClass();

    var student = new Student<String, Integer, Double>("Ade", 97, 5.00);
    System.out.println(student.toString());

    var student1 = new Student<String, Integer, Double>("Kola", 99, 5.00);
    student.nameEquals(student1);

    Car car = new Car();
    Vehicle vehicle = new Vehicle<Car>(car);
    vehicle.showOff();
  }
}
