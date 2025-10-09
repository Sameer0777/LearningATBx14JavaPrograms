package Ex_014_Strings;

public class Lab_138_Interview {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("hello");

        // == -> Comparison -> String => this check the ref location

        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println(s1 == s2);
        System.out.println(s3 == s2);
        System.out.println(s4 == s5);

        // equals ( content) -> value

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5)); // equalsIgnoreCase -> Compares the content and Ignores the Case
    }
}
