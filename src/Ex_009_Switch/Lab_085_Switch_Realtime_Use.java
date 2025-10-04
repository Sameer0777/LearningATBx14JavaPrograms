package Ex_009_Switch;

import java.util.Scanner;

public class Lab_085_Switch_Realtime_Use {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Browser name");
        String browser = sc.nextLine();

        switch(browser){
            case "Chrome":
                System.out.println("Starting the Chrome Browser");
                break;
            case "Firefox":
                System.out.println("Starting the Firefox Browser");
                break;
            case "Edge":
                System.out.println("Starting the Edge Browser");
                break;
            case "Safari":
                System.out.println("Starting the Safari Browser");
                break;
            default:
                System.out.println("No idea about the mentioned Browser");
        }
    }
}
