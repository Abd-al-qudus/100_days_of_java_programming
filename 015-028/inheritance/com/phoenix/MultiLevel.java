/**
 * this is used to test multilevel inheritance
 * B inherits from A and C inherits from B
 * @author: engineerphoenix
 */

package com.phoenix;

class Details {
  int id;
  String fullName;

  void showFullName() {
    System.out.println(this.fullName + " :" + this.id + " has a detail in storage");
  }
}


class Employee extends Details {
  boolean isEmployee;

  void isAnEmployee () {
    if (this.isEmployee) {
      System.out.println(this.fullName + " is an employee: " + this.isEmployee);
    }
    else {
      System.out.println(this.fullName + " is not an employee: " + this.isEmployee);
    }
  }
}


class Manager extends Employee {
  boolean isManager;

  Manager (int id, String fName, boolean emp, boolean man) {
    this.id = id;
    this.isEmployee = emp;
    this.fullName = fName;
    this.isManager = man;
  }

  void isAManager () {
    if (this.isManager) {
      System.out.println(this.fullName + " is a manager: " + this.isManager);
    }
    else {
      System.out.println(this.fullName + " is not a manager: " + this.isManager);
    }
  }
}


public class MultiLevel {
  public static void main(String[] args) {
    Manager manager = new Manager(143, "EngineerPhoenix", true, true);

    manager.showFullName();
    manager.isAnEmployee();
    manager.isAManager();
  }
}
