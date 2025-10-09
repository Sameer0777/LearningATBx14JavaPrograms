package Ex_014_Strings;

public class Lab_141_Example2 {
    public static void main(String[] args) {

        String s = "Java".substring(2);
        System.out.println(s);

        String s1 = "Java".substring(1, 3);
        System.out.println(s1);

        char[] s2 = "Java".toCharArray();
        for (int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }

        String s3 = " Java ".trim();
        System.out.println(s3);

        boolean s4 = " ".isBlank();
        System.out.println(s4);

        String s5 = "ab".repeat(3);
        System.out.println(s5);

        boolean s6 = "Java".equalsIgnoreCase("java");
        System.out.println(s6);

        long s7 = "a\nb\nc\n".lines().count();
        System.out.println(s7);
    }
}
