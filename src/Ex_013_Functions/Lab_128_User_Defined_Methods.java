package Ex_013_Functions;

import java.util.Scanner;

public class Lab_128_User_Defined_Methods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for a");
        int a = sc.nextInt();
        System.out.println("Enter the value for b");
        int b = sc.nextInt();

        int Sum = sum_Of_Two_Numbers(a, b);
        System.out.println("Sum of a and b is -> "+Sum);
        int result1 = sum_Of_Two_Numbers(45, 76);
        int result2 = sum_Of_Two_Numbers(333, 777);

        System.out.println("Sum of a and b is -> "+result1);
        System.out.println("Sum of a and b is -> "+result2);

    }
    static int sum_Of_Two_Numbers(int a, int b){
        return a+b;
    }
    static void sum_Of_Two_numbers(){
        System.out.println("Hi Sam!!!");
    }
}
