package Ex_006_Ternary_Operator;

public class Lab_062_MaxOfTwoNum {
    public static void main(String[] args) {

        int a = 55;
        int b = 45;

        String result = (a > b)? a+ " is greatest number":b+" is greatest number";
        System.out.println(result);

        int max = (a > b)?a:b;
        System.out.println(max);

    }
}
