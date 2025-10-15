package Ex_015_StringBuffer_StringBuilder;

import java.util.Scanner;

public class Lab_151_StringPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to Reverse");
        String input = sc.next();

//        StringBuilder sb = new StringBuilder(input);
//        System.out.println(sb.reverse());
        String rev = "";

        for (int i = input.length() - 1; i >= 0 ; i--) {
            rev = rev + input.charAt(i);
        }

        if(input.equalsIgnoreCase(rev)){
            System.out.println("Given String is Palindrome");
        }
        else{
            System.out.println("Given String is not a Palindrome");
        }
    }
}
