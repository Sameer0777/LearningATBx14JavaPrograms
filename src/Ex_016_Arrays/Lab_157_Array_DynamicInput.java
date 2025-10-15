package Ex_016_Arrays;

import java.util.Scanner;

public class Lab_157_Array_DynamicInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element for pos: "+i);
            arr[i] = sc.nextInt();
        }

        System.out.println("---------Enhanced For Loop to Print the Values------------");

        for(int a: arr){
            System.out.println(a);
        }
    }
}
