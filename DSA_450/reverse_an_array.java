package DSA_450;

import java.util.*;

public class reverse_an_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no  of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Input no " + i);
            arr[i] = sc.nextInt();

        }

        System.out.println(Arrays.toString(arr));

        // Method 1
        // int[] arr2 = new int[n];
        // int count = arr.length - 1;
        // for (int i = 0; i < arr.length; i++) {
        // if (count >= 0) {
        // arr2[i] = arr[count];
        // count--;
        // }
        // }

        // System.out.println(Arrays.toString(arr2));

        // Method 2
        int start = 0, end = arr.length - 1;
        int temp = 0;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));

    }
}
