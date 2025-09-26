package Ex_004_Operators;

public class Lab_040_Interview_Concat_Plus {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        String f_name = "Sameer";
        String l_name = "Sharma";

        System.out.println(f_name+l_name+a+b);
        System.out.println(a+b+f_name+l_name);

        System.out.println(f_name+l_name+(a+b));
    }
}
