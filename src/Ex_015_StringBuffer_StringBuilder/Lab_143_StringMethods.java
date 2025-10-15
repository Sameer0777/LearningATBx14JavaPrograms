package Ex_015_StringBuffer_StringBuilder;

public class Lab_143_StringMethods {
    public static void main(String[] args) {

        String name = "Sameer";

        System.out.println(name.length());
        System.out.println(name.charAt(3));
        // System.out.println(name.charAt(7)); java.lang.StringIndexOutOfBoundsException

        System.out.println(name.concat(" Sharma"));
        System.out.println(name);
        System.out.println(name.contains("Sam"));
        System.out.println(name.equals("Sameer"));
        System.out.println(name.equalsIgnoreCase("sameer"));
        System.out.println(name.indexOf("m"));
        System.out.println(name.indexOf('a'));

        System.out.println(name.replace('S', 's'));
        System.out.println(name.substring(0, 3));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.startsWith("s"));
        System.out.println(name.endsWith("r"));

        String s = "  Sam   ";
        System.out.println(s.trim());
        System.out.println(name.compareTo("Sameer"));

        StringBuilder sb = new StringBuilder("Sam");
        System.out.println(sb.reverse());

        StringBuilder sb1 = new StringBuilder("Hi");
        System.out.println(sb1.toString());


    }
}
