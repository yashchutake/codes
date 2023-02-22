package Recursion.SortingAndPatterns;

import java.util.Arrays;

public class recQuicksort {
    public static void main(String[] args) {
        int arr[] ={5,4,34,3,2,1};
        Quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void Quicksort(int[] arr, int low, int hi) {
        
        if(low >= hi){
            return;
        }
        
        
        int s=low;
        int e=hi;
        int mid=s+(e-s)/2;
        int pivote=arr[mid];

        while (s<=e) {
            //aslo resion it will stop sorting further if it will alerady sorted as we see in the merge sort
            while (arr[s] < pivote) {
                s++;
            }
            while (arr[e] > pivote) {
                e--;
            }

            if(s<=e){
                int t=arr[s];
                arr[s]=arr[e];
                arr[e]=t;
                s++;
                e--;
            }
        }
        // now my pivote is at correct index , please sort into two halves now halffff
        Quicksort(arr, low, e);
        Quicksort(arr, s, hi);
    }


}
