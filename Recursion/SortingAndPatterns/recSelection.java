package Recursion.SortingAndPatterns;

import java.util.Arrays;

public class recSelection {
    public static void main(String[] args) {
        int[] arr={5,4,-2,-2221,-1,3,2,1,0};
         selction(arr,arr.length, 0,0);// passing max index 0 assuming the first index max
         System.out.println(Arrays.toString(arr));
    }
    static void selction(int[] arr, int r,int c, int max){
        if(r==0){
            return;
        }   
        if(c<r){
                if(arr[max] < arr[c]){
                    selction(arr, r, c+1, c); //pasing c index as maxmimum foud yet
                }
                else{
                // System.out.print("* ");
                 selction(arr,r, c+1,max);
                }
        }
        else{
           //System.out.println();
           int t=arr[max];
           arr[max]=arr[r-1];
           arr[r-1]=t;
           selction(arr,r-1, 0,0);
        }
    }
}
