/**
 * java streams: continous flow of java object
 * a streamable function can be chained to an
 * intermediate operation in the pieline.
 * the operations at the end of the stram which
 * displays the output is known as terminal operation.
 * @author: engineerphoenix
 */


import java.util.Arrays;
import java.util.List;
// import javax.swing.*;

public class JavaStream {
    public static void main(String... args){
        List<Integer> bigList = List.of(1, 23, 56, 11, 56, 47, 53, 100, 250, 110);
        bigList.stream()
            .forEach(i -> 
                System.out.println(Thread.currentThread().getName() + ": " + i)
            );
        //processing the objects in different streams
        //it creates a thread pool which is reusable
        bigList.parallelStream()
            .forEach(i -> 
                System.out.println(Thread.currentThread().getName() + ": " + i)
            );
        
        //creating streams from array, it can be truncated to match up
        // eg Arrays.stream(arr, 3, 6).forEach()
        int[] arr = {50, 100, 150, 200, 250, 300};
        Arrays.stream(arr).parallel().forEach(
            i -> System.out.println(Thread.currentThread().getName() + ": " + i)
        );
    }
}
