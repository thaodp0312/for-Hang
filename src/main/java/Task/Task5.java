package Task;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Create a set of numbers (Set<Integer>) and add 10 different numbers to it.
 * <p>
 * Remove from the set all numbers greater than 10 .
 * <p>
 * Requirements:
 * •Create createSet() method to create and return a HashSet containing 10 different numbers.
 * •Create removeAllNumbersGreaterThan10() method to remove from the set all numbers greater than 10.
 * •Write unit test for the removeAllNumbersGreaterThan10() method
 */
public class Task5 {

    public Set<Integer> createSet() {
        //write your code here
        Set<Integer> s = new HashSet<>();
        s.add(5);
        s.add(6);
        s.add(7);
        s.add(8);
        s.add(9);
        s.add(10);
        s.add(11);
        s.add(12);
        s.add(13);
        s.add(14);

        return s;
    }

    public Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        //write your code here
        Set<Integer> tmp = new HashSet<>();
        for (int x : set) {
            if (x <= 10) {
                tmp.add(x);
            }
        }
        return tmp;
    }

//    public static void main(String[] args) {
//        //write your code here
//        Task5 t5 = new Task5();
//       t5.createSet();
//        Set<Integer> s = t5.removeAllNumbersGreaterThan10(t5.createSet());
//        System.out.println("những số nhỏ hơn bằng 10");
//        for (int x: s){
//            System.out.println(x);
//        }
//    }

}
