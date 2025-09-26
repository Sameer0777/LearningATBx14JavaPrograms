package Ex_004_Operators;

public class Lab_046_All_Operators {
    public static void main(String[] args) {

        int a = 15;
        int b = 23;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b); // If a is greater than b than a is the result

        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a == b);
        System.out.println(a!=b);

        int age =24;
         age += 1; // Compound assignment operator
        age -= 1;
        age *=1;
        age /=1;

    }
}
