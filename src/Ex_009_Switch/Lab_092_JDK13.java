package Ex_009_Switch;

public class Lab_092_JDK13 {
    public static void main(String[] args) {

        int branch_code = 001;
        switch(branch_code){
            case 001,002,003:
                System.out.println("CSE and ISE");
                break;
            case 004,005,006:
                System.out.println("EEE and ECE");
                break;
            case 007:
                System.out.println("ME and BT");
                break;
            default:
                System.out.println("Admin Office Staff");
        }
    }
}
