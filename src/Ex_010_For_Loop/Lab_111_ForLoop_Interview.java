package Ex_010_For_Loop;

public class Lab_111_ForLoop_Interview {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {

            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }
}
