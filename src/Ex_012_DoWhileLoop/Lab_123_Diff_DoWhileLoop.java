package Ex_012_DoWhileLoop;

public class Lab_123_Diff_DoWhileLoop {
    public static void main(String[] args) {

        int a = 0;
        while(a < 0){
            System.out.println(a);
            a++;
        }

        do{
            System.out.println(a);
            a++;
        }while(a < 0);
    }
}
