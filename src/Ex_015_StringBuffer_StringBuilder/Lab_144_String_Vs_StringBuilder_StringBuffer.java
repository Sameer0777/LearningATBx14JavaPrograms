package Ex_015_StringBuffer_StringBuilder;

public class Lab_144_String_Vs_StringBuilder_StringBuffer {
    public static void main(String[] args) {

        // 90% we use Strings
        String s = "Sam";
        String s1 = new String("Sharma");

        //10% we use String Builder and String Buffer

        StringBuilder sb = new StringBuilder("Sameer");
        StringBuffer sb1 = new StringBuffer("Sharma");

        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb.reverse());
        System.out.println(sb1.reverse());
    }
}
