package Ex_002_Java_Basics;

public class Lab_020_Printf {
    public static void main(String[] args) {

        int a = 12;
        int b = 34;
        char c = 'H';

        /*
        System.out.println(a);
        System.out.println(b);

        System.out.print(a);
        System.out.print(b);
       */
        System.out.printf("Value of a is %d\n",a);
        System.out.printf("Value of b is %d\n",b);
        System.out.printf("Value of c is %c", c);

        /*
        * %d -> byte, short, int, long
        * %s -> String
        * %f -> float, double
        * %b -> boolean
        * %c -> char
        * */


    }
}
