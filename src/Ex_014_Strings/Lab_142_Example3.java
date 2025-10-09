package Ex_014_Strings;

public class Lab_142_Example3 {
    public static void main(String[] args) {

        String s  = "Java";
        char c = s.charAt(0);
        System.out.println(s.charAt(1));
        System.out.println(c);

        int result = "abc".compareTo("ABC");
        System.out.println(result);

        int idx = "Java".indexOf('a');
        System.out.println(idx);

        int idx2 = "Java".lastIndexOf('a');
        System.out.println(idx2);

        boolean b = "".isEmpty();
        System.out.println(b);

        String t = String.join("#", "Java", "Python"); // can use *,#,- any characters
        System.out.println(t);

        String e = "Java".replace('a','o');
        System.out.println(e);

        boolean f = "Java".startsWith("Ja");
        System.out.println(f);

        String g = "Java".concat("JDK");
        System.out.println(g);

    }
}
