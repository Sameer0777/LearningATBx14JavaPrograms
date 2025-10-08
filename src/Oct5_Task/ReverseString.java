package Oct5_Task;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Write a program to reverse a string without using inbuilt functions.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to Reverse");
        String s = sc.next();
        String s2 = "";

        for(int i = s.length()-1; i>= 0; i--){
            s2+=s.charAt(i);
        }
        System.out.println("The reverse of the given String "+s+" is -> "+s2);
    }
}
