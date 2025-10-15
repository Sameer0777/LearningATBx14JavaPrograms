package Ex_016_Arrays;

import java.util.Arrays;

public class Lab_160_SecondHighNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
