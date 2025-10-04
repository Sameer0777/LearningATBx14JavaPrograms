package Ex_010_For_Loop;

public class Lab_109_ForLoop_Break {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) { // 0 to 49 -> loop runs for 50 times

            if(i == 5){
                break;
            }
            System.out.println(i);
        }
    }
}
