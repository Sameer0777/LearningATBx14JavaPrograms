package Ex_016_Arrays;

public class Lab_152_Array {
    public static void main(String[] args) {

        int a = 10;
        int[] marks = {95, 98, 98, 97, 96};

        boolean[] b = {true, false, true};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);

        // System.out.println(marks[-1]); java.lang.ArrayIndexOutOfBoundsException

        String s = "Sameer";
        String[] s1 = s.split("");

        for(String s2: s1){
            System.out.print(s2);
        }


    }
}
