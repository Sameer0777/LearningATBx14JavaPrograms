package Ex_014_Strings;

public class Lab_139_StringMethods {
    public static void main(String[] args) {

        String a1 = "Hello";
        String a2 = "Hello";

        String a3 = new String("Hello");

        System.out.println(a1 == a2);
        System.out.println(a1 == a3);
        System.out.println(a1.equals(a3));
        System.out.println(a1.concat(a3));
    }
}
