/**
 * this class is used to test heirachial inheritance
 * two classes inherits from the same base class
 * @author: engineerphoenix
 */

package com.phoenix;

class Vehicle {
  int numOfGear;
  String name;
  String color;

  void movement () {
    System.out.println(this.name + " vehicles can move");
  }

  void wheels () {
    System.out.println(this.name + " vehicles have 4 wheels");
  }

  void gears () {
    System.out.println(this.name + " vehicle has " + this.numOfGear + " gears");
  }
}


class Benz extends Vehicle {
  int id;

  Benz (String name, String color, int id) {
    this.id = id;
    this.name = name;
    this.color = color;
  }

  @Override // override an instance
  void gears () {
    System.out.println("My benz is automatic, so i dont need gears");
  }
}


class Honda extends Vehicle {
  int id;

  Honda (String name, String color, int id, int gear) {
    this.id = id;
    this.numOfGear = gear;
    this.name = name;
    this.color = color;
  }
}


public class Heirachial {
  public static void main(String... args) {
    Honda honda = new Honda("Baby Boy", "Blue", 121, 6);
    Benz benz =  new Benz("AV12", "Ash", 201);

    System.out.println("Honda");
    honda.movement();
    honda.wheels();
    honda.gears();

    System.out.println("Benz");
    benz.movement();
    benz.wheels();
    benz.gears();
  }
}
