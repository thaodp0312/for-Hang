package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

/**
 * Write a program that will read a string containing numbers from the keyboard, each number is separated by comma ","
 * <p>
 * Display to screen the whole list of number in decreasing sorting order.
 * <p>
 * If string contains alphabetical character instead of a number, then the method should catch an exception and display to screen the message "String contains character which cannot be converted into number".
 * <p>
 * Requirements:
 * •The program must read a string of numbers from the keyboard.
 * •The readData method is to read numbers from the keyboard
 * •The readData method must contain a try-catch block.
 * •The sortNumber method is to sorting list of numbers into decreasing order.
 * •The readData method calls sortNumber method.
 * •If the user enters alphabetical character rather than a number, the program should display message "String contains character which cannot be converted into number".
 */

public class Task1 {
    public List<Integer> readData() {
        //write your code here
        System.out.println("Nhập các số");
        Scanner sc = new  Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();
        str = str.replaceAll("\\s+", "");
        str = str + ",";

        List<Integer> ls = new ArrayList<>();
        try {
            int x = 0;
            for (int i = 0; i < str.length(); i++) {
                if (Character.toString(str.charAt(i)).equals(",")) {
                    int y = Integer.parseInt(str.substring(x, i));
                    x = i + 1;
                    ls.add(y);
                }
            }

        } catch (Exception e) {
            System.out.println("String contains character which cannot be converted into number");
        }

        return ls;
    }

    public List<Integer> sortNumberList(List<Integer> list) {
        //write your code here
        Collections.sort(list, Collections.reverseOrder());
        return list;

    }

    public static void main(String[] args) {
        //write your code here
        Task1 t1 = new Task1();
        List<Integer> ls = t1.readData();
        System.out.println("Các số đã nhập là");
        for (Integer x : ls) {
            System.out.println(x);
        }
        System.out.println("Các số đã được sắp xếp giảm dần: ");
        List<Integer> ls2 = t1.sortNumberList(ls);
        for (Integer z : ls2) {
            System.out.println(z);
        }

    }
}



