package Ex_016_Arrays;

public class Lab_164_2DArrayLoopPrint {
    public static void main(String[] args) {
        int[][] arr3_3 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

//        for (int i = 0; i < arr3_3.length; i++) {
//            for (int j = 0; j < arr3_3[i].length; j++) {
//                System.out.print(arr3_3[i][j]+ " | ");
//                //System.out.println("*");
//            }
//            //System.out.print("\n");
//            System.out.println();
//        }
        for (int i = 0; i < arr3_3.length; i++) {
            for (int j = 0; j < arr3_3.length; j++) {
                System.out.print(arr3_3[i][j]);
            }
            System.out.println();
        }
    }
}
