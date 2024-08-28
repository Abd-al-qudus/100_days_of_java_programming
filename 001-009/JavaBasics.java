/**
 * a test class containing java basics and loops
 * statements, declarations and variables,
 * javadocs
 */


import java.util.List;


public class JavaBasics {
  public static void main(String[] args) {
    // create a list
    String[] cars = {"audi", "benz", "camry", "toyota", "honda", "hyundai"};
    List<String> newCars = List.of("audi", "benz", "camry", "toyota", "honda", "hyundai");
    //loop through list items
    for(String car: cars) {
      System.out.println(car);
    }

    int i = 0;
    do {
      if(cars[i].startsWith("a")) {
        System.out.println("Car: " + cars[i] + " starts with a");
      }
      else if(cars[i].contains("h")) {
        System.out.println("Car: " + cars[i] + " contains h");
      }
      else {
        System.out.println("Car: " + cars[i] + " is neutral");
      }
      i++;
    } while(i < cars.length);

    for(int j = 0; j < cars.length; j++) {
      System.out.println(cars[j].toUpperCase());
      System.out.println(cars[j].toLowerCase());
      System.out.println(cars[j].toCharArray());
      System.out.println(cars[j].length());
      //System.out.println(cars[j].lines());
      //System.out.print(cars[j].chars());
      //System.out.print(cars[j].translateEscapes());
    }

    int k = 0;
    while (k < cars.length) {
      switch (cars[k].toString()) {
        case "hyundai":
          System.out.println("caught a hyundai");
          break;
        case "audi":
          System.out.println("caught an audi");
          break;
        case "benz":
          System.out.println("benz is for the rich");
          break;
        case "honda":
          System.out.println("honda is a fake product");
          break;
        default:
          System.out.println("default print without catching");
      }
      k++;
    }
    // note the difference between list and array in java
    newCars.forEach(car -> {
      if (car == "audi" || car == "benz") {
        System.out.println("forEachLoop: " + car);
      }
      else {
        System.out.println("nothing is caught in forEachLoop");
      }
    });

    int[] numbers = new int[3];
    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;
    int sum = 0;

    for (int u: numbers) {
      sum += u;
    }
    System.out.println("sum of the array content is: " + sum);

    int[][] multidim = {{1,2,3}, {4,5,6}, {7,8,9}};
    for(int[] idx: multidim) {
      for(int x: idx) {
        System.out.print(x + " ");
      }
      System.out.print("\n");
    }
  }
}
