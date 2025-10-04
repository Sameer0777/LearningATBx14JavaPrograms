package Ex_009_Switch;

public class Lab_91_JDK13_Above {
    public static void main(String[] args) {

        int item = 007;

        switch (item){
            case 001-> System.out.println("Item 001");
            case 002 -> System.out.println("Item 002");
            case 003 -> System.out.println("Item 003");
            case 004 -> System.out.println("Item 004");
            case 007 -> System.out.println("Item 007");
            default -> System.out.println("Default");
        }
    }
}
