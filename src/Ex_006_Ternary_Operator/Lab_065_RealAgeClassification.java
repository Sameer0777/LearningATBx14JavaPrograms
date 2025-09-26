package Ex_006_Ternary_Operator;

public class Lab_065_RealAgeClassification {
    public static void main(String[] args) {

        String userInput = args[2];
        System.out.println(userInput);
        System.out.println(userInput instanceof String);

        int age = Integer.parseInt(userInput);
        String result = age < 18? "Minor":age<60? "Adult":"Senior Citizen";
        System.out.println(result);
    }
}
