package Ex_016_Arrays;

import java.util.Arrays;

public class Lab_156_MaxAndMin {
    public static void main(String[] args) {

        int[] arr = {12, 34, 45, 83, 23, 7, 19, 39, 49, 99, 15, 35, 183};

//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-1]);

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] < min){
                min  = arr[i];
            }
        }
        System.out.println(min);

    }
}
