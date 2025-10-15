package Ex_015_StringBuffer_StringBuilder;

public class Lab_148_StringBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);

        sb.replace(0,4,"JavaScript");
        System.out.println(sb);

    }
}
