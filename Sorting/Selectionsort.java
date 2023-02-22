package Sorting;
import java.sql.Array;
import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr={5,4,-2,-2221,-1,3,2,1,0};
        selection(arr);
        System.out.print(Arrays.toString(arr));
    }

     static void selection(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int start=0;
            int end=arr.length-i-1;
            int max=getmax(arr,start,end);
            swap(arr,end,max);
        }
    }

      static void swap(int[] arr, int end, int max) {
          int temp=arr[end];
          arr[end]=arr[max];
          arr[max]=temp;
    }

    static int getmax(int[] arr, int start, int end) {
        int max=start;    
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i; 
            }
        }
        System.out.println(max);
        return max;
    }
}
