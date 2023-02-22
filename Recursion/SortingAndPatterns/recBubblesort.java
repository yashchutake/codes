package Recursion.SortingAndPatterns;

import java.util.Arrays;

public class recBubblesort {
    public static void main(String[] args) {
        int [] arr={7,1,5,3,6,4};
        bubbleRc(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void    bubbleRc(int[] arr, int r,int c){
        if(r==0){
            return;
        }   
        if(c<r){
            if(arr[c] > arr[c+1]){
                //swap
                int t=arr[c+1];
                arr[c+1]=arr[c];
                arr[c]=t;
            }
            bubbleRc(arr,r, c+1);
        }
        else{
           System.out.println();
            bubbleRc(arr,r-1, 0);
        }
    }
}
