package Ex_005_TypeCasting;

public class Lab_056_TypeCasting_Narrowing {
    public static void main(String[] args) {

        int a = 365;

        // byte b = a; Implicit narrowing is not valid
        byte c = (byte) a; // Narrowing should be done explicitly
        System.out.println(c);
    }
}
