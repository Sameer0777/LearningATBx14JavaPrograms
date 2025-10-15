package Ex_015_StringBuffer_StringBuilder;

public class Lab_145_StringBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Sameer");

        sb.append(" Sharma");
        System.out.println(sb);

        String s = "Sameer";
        s = s + " Sharma";
        System.out.println(s);
    }
}
