package Ex_005_TypeCasting;

public class Lab_054_TypeCasting0 {
    public static void main(String[] args) {

        byte b = 7;

        int  a =b; // Implicit typecasting/ Widening
        int c = (int) b; // Explicit typecasting/Widening

       // int g = 43;
        // byte h = g; should be explicitly downcasted/ Narrowing
    }
}
