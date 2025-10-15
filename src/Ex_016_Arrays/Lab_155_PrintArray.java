package Ex_016_Arrays;

public class Lab_155_PrintArray {
    public static void main(String[] args) {

        int[] marks = {95, 86, 97, 91, 85, 65};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

        System.out.println("------For Loop----------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        System.out.println("-------Enhanced For Loop-----------");

        for(int i: marks){
            System.out.println(i);
        }
    }
}
