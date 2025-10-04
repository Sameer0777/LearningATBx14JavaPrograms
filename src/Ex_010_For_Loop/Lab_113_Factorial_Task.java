package Ex_010_For_Loop;

import java.util.Scanner;

public class Lab_113_Factorial_Task {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();

        int fact =1;
        if(n == 0){
            fact = 1;
        }
        for(int i = 1; i<=n; i++){
            fact*=i;
        }
        System.out.println("Factorial of "+n+" is -> "+fact);
    }
}
