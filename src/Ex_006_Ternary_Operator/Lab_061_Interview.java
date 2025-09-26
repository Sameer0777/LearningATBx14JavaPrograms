package Ex_006_Ternary_Operator;

public class Lab_061_Interview {
    public static void main(String[] args) {

        int age = 24;

        /*
        Nested ternary:
        result = condition1 ? (condition2 ? expression1 : expression2) ; expression3;
         */
        String result = (age > 18) ? (age > 25 ? "Yes you can go to Goa and You can Drink" : "You can go to Goa, but cannot drink") : "No, you cannot go to Goa";
        System.out.println(result);
    }
}
