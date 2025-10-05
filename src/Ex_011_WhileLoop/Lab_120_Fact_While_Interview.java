package Ex_011_WhileLoop;

import java.util.Scanner;

public class Lab_120_Fact_While_Interview {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number for finding its Factorial");
        if(!sc.hasNextInt()){
            System.out.println("Enter a Integer Number!");
        }
        else{
            int num = sc.nextInt();
            int number = num;
            int fact = 1;
            if(num == 0){
                fact = 1;
            }
            else{

                while(num > 0) {
                    fact *= num;
                    num--;
                }
            }
            System.out.println("Factorial of "+number+" is -> "+fact);
        }
    }
}
