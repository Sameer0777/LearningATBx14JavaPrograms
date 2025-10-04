package Ex_009_Switch;
import java.util.Scanner;

public class Lab_084_Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
        }
    }
}
