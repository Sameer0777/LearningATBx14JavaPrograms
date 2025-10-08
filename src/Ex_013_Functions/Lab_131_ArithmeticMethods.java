package Ex_013_Functions;

import java.util.Scanner;

public class Lab_131_ArithmeticMethods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = readInt(sc, "Enter value for a");
        int b = readInt(sc, "Enter value for b");

        int addition = add(a,b);
        int substraction = sub(a,b);
        int multiplication = mul(a,b);
        int division1 = div(a,b);
        int modulus = mod(a,b);

        System.out.println(addition);
        System.out.println(substraction);
        System.out.println(multiplication);
        System.out.println(division1);
        System.out.println(modulus);

    }
    static int readInt(Scanner sc, String prompt){
        System.out.println(prompt);
        if(sc.hasNextInt()){
            return sc.nextInt();
        }
        else{
            System.out.println("Enter int only!!!");
            System.exit(0);
        }
        return 0;
    }
    static int add(int a, int b){
        return a+b;
    }
    static  int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        return a/b;
    }
    static int mod(int a, int b){
        return a%b;
    }
}
