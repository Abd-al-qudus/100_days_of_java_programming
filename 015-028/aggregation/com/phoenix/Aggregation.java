/**
 * This is use to test aggregation
 * aggregation exists at area of loose connection
 * the subclass can exist without the superclass
 * @author: engineerphoenix
 */

package com.phoenix;

class Name {
  String first;
  String last;

  Name(String f, String l) {
    this.first = f;
    this.last = l;
  }
}


class Employee {
  int id;
  Name name;

  Employee (int id, Name nm) {
    this.id = id;
    this.name = nm;
  }

  void welcome() {
    System.out.println("Welcome");
    System.out.println(this.name.first + " " + this.name.last + " has an id: " + this.id);
  }
}


public class Aggregation {
  public static void main (String... args) {
    Name nm = new Name("Engineer", "phoenix");
    Employee emp = new Employee(234, nm);

    emp.welcome();
  }
}
