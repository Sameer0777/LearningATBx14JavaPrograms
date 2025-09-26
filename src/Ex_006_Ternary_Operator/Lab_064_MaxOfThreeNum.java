package Ex_006_Ternary_Operator;

public class Lab_064_MaxOfThreeNum {
    public static void main(String[] args) {

        int a = 7;
        int b = -9;
        int c = -6;

        // Logic Building Formula

        // Step 1 ->  Find the inputs and outputs data type.
        // I/O -> n1,n2,n3 -> int
        // O/P -> int - max number or String we can message with max number.


        // Step 2 - Rough Logic, Think about it.
        //  n1 >  n2 && n1 > n3 ->  n1
        //  n2 > n3 && n2 > n1 -> n2
        //  n3


        // Step 3 - Dryn Run - program

        String result = (a>b)?(a>c)? a+" is Greatest Number": c+" is Greatest Number":(b>c)? b+" is Greatest Number":c+" is Greatest Number";
        System.out.println(result);
    }
}
