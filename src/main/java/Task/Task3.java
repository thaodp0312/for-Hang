package Task;

import java.util.Scanner;

/**
 * Write a method readString that reads a string from the keyboard.
 * <p>
 * Write a method upperCaseString to change the first letter of each word to uppercase
 * <p>
 * Display the result on the screen.
 * <p>
 * Example input:
 * sam i am.
 * <p>
 * Example output:
 * Sam I Am.
 * <p>
 * Requirements:
 * •The method readString should read a string from the keyboard.
 * •The method upperCaseString should change the first letter of each word to uppercase
 * •The main method displays the result to screen.
 */
public class Task3 {
    public String readString() {
        //write your code here
        System.out.println("Hãy nhập chuỗi:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;

    }

    public String upperCaseString(String s) {
        //write your code here

        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        String[] mang = s.split("\\s");
        StringBuilder[] mang2 = new StringBuilder[s.length()];
        StringBuilder xau = new StringBuilder();
        for (int i = 0; i < mang.length; i++) {
            mang2[i] = new StringBuilder(mang[i]);
            mang2[i] = mang2[i].replace(0, 1, Character.toString(mang[i].charAt(0)).toUpperCase());
            xau = xau.append(mang2[i]).append(" ");
        }
        return (xau.toString().trim());


    }

    public static void main(String[] args) {
        //write your code here
        Task3 t3 = new Task3();
        String s = t3.upperCaseString(t3.readString());
        System.out.println(s);
    }

}
