/**
 * collection objects has a lot of interfaces such as
 * collection, map and iterator. collection includes
 * list, queue, deque, set, sortedset. maps includes
 * sortedmap and iterator includes listiterator,hashset
 * linkedhashset.
 * @author: engineerphoenix
 */
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;


public class CollectionObjects {
    @SuppressWarnings("unchecked")
    public static void main(String... args){
        // an arraylist that takes in an integer
        // one of the java collection classes
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        @SuppressWarnings("rawtypes")
        List vals = List.of(1,2,3,4,6,7,8, "new", "big"); //immutable list object

        for(int i = 0; i < 50; i++){
            if (i % 2 == 0) list.add(i);
        }

        for(int i = 40; i < 100; i++){
            if (i % 2 == 0) list2.add(i);
        }

        //dynamic arraylist
        var newList = new ArrayList<>();
        newList.add("mathew");
        newList.add(1);
        newList.add(0, "James");
        newList.add('u');
        newList.add(3.445f);
        newList.forEach(System.out::println);
        
        //remove with index
        list.remove(1);
        // remove with autoboxed value with unknown index
        list.remove(Integer.valueOf(44));
        //set an element at index
        list.set(3, 14);
        
        //add all element of list to list2
        list2.addAll(list);
        list2.forEach(System.out::println);
        System.out.println("------------");
        //remove all occurence of list 1 from list 2
        list2.removeAll(list);
        list2.forEach(System.out::println);
        vals.forEach(System.out::println);

        //convert a list to an array
        var newVals = vals.toArray();
        System.out.println(newVals[5]);
        //convert a list to an array
        var newValue = Arrays.asList(newVals);
        System.out.println(newValue.indexOf("big"));

        //elvis operation
        boolean check = 34 > 32 ? true : false;
        System.out.println(check);
        
        //i can create an interface of arraylist with collection or list
        //set
        Set<String> stringList = new HashSet<String>();
        stringList.add("Ademola");
        stringList.add("Jambito");
        stringList.add("Ademola");
        stringList.add("James");

        for(String name: stringList){
            System.out.println(name);
        }

        //using iterators to print out values
        Iterator<String> iterNames = stringList.iterator();

        while(iterNames.hasNext()){
            System.out.println(iterNames.next());
        }

        //treeset sorts element by default
        TreeSet<String> sortedNames = new TreeSet<String>();
        sortedNames.add("galileo");
        sortedNames.add("scheele");
        sortedNames.add("newton");
        sortedNames.add("euler");
        sortedNames.add("leonard");

        Iterator<String> names = sortedNames.iterator();
        while(names.hasNext()){
            System.out.println(names.next());
        }

        //map just like a dictionary in python
         Map<String, Integer> students = new HashMap<>();
         students.put("Musa", 70);
         students.put("Issa", 80);
         students.put("Bello", 85);

         // put if not present
         students.put("Issa", 90);
         students.putIfAbsent("Bravo", 90);

         System.out.println(students);
         //loop through all the keysets
         students.remove("Bravo");
         for(String key: students.keySet()){
            System.out.println(key);
         }
         for(Integer value: students.values()){
            System.out.println(value);
         }

         // hashtable is useful for synchronized programs - multithreaded applications

         //sorting a collection
         List<Integer> scores = new ArrayList<>();

         scores.add(17);
         scores.add(21);
         scores.add(12);
         scores.add(99);
         scores.add(86);
         scores.add(65);
         scores.add(74);
         Collections.sort(scores);
         System.out.println(scores);
         //sorting with custom logics includes using comparators
         //sorting with comparator, sort the list with the last digit
         Comparator<Integer> comparator = new Comparator<Integer>() {
            public int compare(Integer a, Integer b){
                if(a%10 > b%10) return 1;
                else return -1;
            }
         };

         Collections.sort(scores, comparator);
         System.out.println(scores);

         //sort an array based on the length of a string
         List<String> unsortedStrings = new ArrayList<>();
         unsortedStrings.add("James");
         unsortedStrings.add("Bond");
         unsortedStrings.add("Nicholas");
         unsortedStrings.add("Van Der Vaart");
         unsortedStrings.add("Conquistador");
         unsortedStrings.add("Veronica");
         unsortedStrings.add("Dalexy");
         unsortedStrings.add("Bat");

         Comparator<String> comp = (String n1, String n2) -> {
            if(n1.length() > n2.length()) return 1;
            else return -1;
         };

         Collections.sort(unsortedStrings, comp);
         System.out.println(unsortedStrings);

         List<Cars> cars = new ArrayList<>();
         cars.add(new Cars("BMW", 5000));
         cars.add(new Cars("TOYOTA", 55000));
         cars.add(new Cars("HONDA", 25000));
         cars.add(new Cars("IJAPA", 2500));
         cars.add(new Cars("NISSAN", 34000));
         cars.add(new Cars("LEXUS", 65000));

         Collections.sort(cars);
         System.out.println(cars);

         //working with streams
         List<Integer> numStream = Arrays.asList(23, 21, 43, 19, 97, 67, 45, 65, 53, 20, 48, 59);
         numStream.stream().filter(i -> i%2==0).map(i -> i*i*i).forEach(System.out::println);;
        
        //  strm.forEach(System.out::println);
        
        // strm.filter(i -> i %2 ==0).forEach(System.out::println);;
        // strm.filter(i -> i % 2 != 0).forEach(System.out::println);;

        // square the numbers
        // var sqrOdd = odd.map(i -> i*i);
        // var cubeEven = even.map(i -> i*i*i);
        // System.out.println(odd);
        // System.out.println(even);
    }
}

//we can use comparator or comparable to sort depending on sorting logic
class Cars implements Comparable<Cars> {
    String name;
    int price;

    public Cars(String nm, int pr){
        this.name = nm;
        this.price = pr;
    }

    public int compareTo(Cars newCar) {
        return this.price > newCar.price ? 1 : -1;
    }

    @Override 
    public String toString(){
        return "Car-{" + this.name + ": " + this.price + "}";
    }
}
