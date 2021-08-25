package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1. Use the keyboard to enter the number N.
 * <p>
 * 2. Use the keyboard to enter N integers and put them in a list: the getIntegerList method.
 * <p>
 * 3. Find the minimum among the list items: the getMinimum method.
 * <p>
 * Requirements:
 * •The program should read values from the keyboard.
 * •The getIntegerList() method should read the number N from the keyboard and then return a list of N elements, which has been filled with numbers read from the keyboard.
 * •The getMinimum() method must return the minimum among the list items.
 * •The main() method should call the getIntegerList() method.
 * •The main() method should call the getMinimum() method.
 */
public class Task4 {
    public static void main(String[] args) {
        //write your code here
        Task4 t4 = new Task4();
        List<Integer> l = t4.getIntegerList();
        System.out.println("Phần tử nhỏ nhất: ");
        System.out.println(t4.getMinimum(l));
    }

    public int getMinimum(List<Integer> array) {
        // write your code here
        int min = array.get(0);
        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    public List<Integer> getIntegerList() {
        // write your code here
        System.out.println("Nhập số phần tử: ");
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập các phần tử: ");
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            int y = Integer.parseInt(sc.nextLine());
            l.add(y);
        }
        return l;

    }
}
