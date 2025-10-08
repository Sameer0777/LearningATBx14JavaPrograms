package Ex_013_Functions;

public class Lab_127_Sample_Methods {
    public static void main(String[] args) {

        method_WithNoReturn_Type();
        String s = method_WithReturnType();
    }

    static void method_WithNoReturn_Type(){

        System.out.println("Method with no return type");
    }
    // Method with Return Type -> which returns any DataType( int, float, double, String, byte, char, boolean )

    static String method_WithReturnType(){
        System.out.println("Method with return type");
        return "Hi, Sam!!!!";
    }
    static boolean methodOne(){
        return true;
    }
    static float methodTwo(){
        return 3.14f;
    }
    static byte methodThree(){
        return 100;
    }
    static long methodFour(){
        return 350000l;
    }
}
