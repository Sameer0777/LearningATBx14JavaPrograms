package Ex_009_Switch;

public class Lab_093_Interview {
    public static void main(String[] args) {

        int a = 1;
        switch(-1){
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("Correct");
                break;
            case 9:
                System.out.println("9");
                break;
        }
    }
}
