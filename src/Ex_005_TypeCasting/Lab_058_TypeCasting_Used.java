package Ex_005_TypeCasting;

public class Lab_058_TypeCasting_Used {
    public static void main(String[] args) {

        int course = 10000;
        float GST = 17.45f;

        int total = course+(int)GST; // Narrowing should be done explicitly
        System.out.println(total);

        float total1 = course+GST; // Widening happens implicitly
        System.out.println(total1);
    }
}
