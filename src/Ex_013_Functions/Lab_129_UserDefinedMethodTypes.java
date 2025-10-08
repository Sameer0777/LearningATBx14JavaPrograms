package Ex_013_Functions;

public class Lab_129_UserDefinedMethodTypes {
    public static void main(String[] args) {
        /* 1.Method without parameters and without return type
           2.Method without parameters and with return type
           3.Method with parameters and without return type
           4.Method with parameters and with return type
         */

        method1();
        String s = method2();
        System.out.println(s);
        method3("Sameer Sharma", 24);

        int result1 = sumOfTwoNumbers(7, 3);
        float result2 = sumOfTwoFloatNumbers(3.14f, 45.6f);
        int result3 = sumOfThreeNumbers(4, 5, 8);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);


    }
    // Method without parameters and without return type
    static void method1(){
        System.out.println("Method without parameters and without return type");
    }
    // Method without parameters and with return type
    static String method2(){
        System.out.println("Method without parameters and with return type");
        return "Sameer Sharma";
    }
    // Method with parameters and without return type
    static void method3(String name, int age){
        System.out.println("My Name is "+name+" and my Age is "+age);
    }
    // Method with parameters and with return type
    static int sumOfTwoNumbers(int a, int b){
        return a+b;
    }
    static int sumOfThreeNumbers(int a, int b, int c){
        return a+b+c;
    }
    static float sumOfTwoFloatNumbers(float a, float b){
        return a+b;
    }
}
