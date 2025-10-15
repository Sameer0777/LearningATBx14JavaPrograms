package Ex_015_StringBuffer_StringBuilder;

import java.util.Scanner;

public class Lab_149_toCharArrayMethod {
    public static void main(String[] args) {

        // Write a program to reverse a string without using inbuilt functions.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to Reverse");
        String s = sc.next();

        char[] arr = s.toCharArray();
        String rev  = "";

        for (int i = arr.length -1 ; i >= 0 ; i--) {
            rev = rev + arr[i];
        }
        System.out.println(rev);
    }
}
