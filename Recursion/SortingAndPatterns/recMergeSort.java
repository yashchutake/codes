package Recursion.SortingAndPatterns;

import java.lang.reflect.Array;
import java.util.Arrays;

public class recMergeSort {
    public static void main(String[] args) {
        int [] arr={1,5,3,2,8,9};
       // int[] ans=mergesort(arr);
       //        System.out.println(Arrays.toString(ans));
Arrays.sort();       
       //INPLACE SORT
        mergesortInplace(arr , 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

     static int[] mergesort(int[] arr) {
       if(arr.length==1){
        return arr;
       }
       int mid=arr.length/2;
       int[] left=mergesort( Arrays.copyOfRange(arr,0, mid));
       int[] right=mergesort( Arrays.copyOfRange(arr,mid,arr.length));
       return merge(left,right);
    }

   static int[] merge(int[] left, int[] right) {

        int i=0,j=0,k=0;
        int[] mix=new int[left.length+right.length];
        while(i< left.length && j<right.length){
            if(left[i] < right[j]){
                mix[k]=left[i];
                i++;
            }
            else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }

        //it possible to have length of one array is grater then we simply copy that elements and paste in last of mix
        while(i<left.length){ //left one
            mix[k]=left[i];
            k++;i++;
        }

        while(j<right.length){// for right one
            mix[k]=right[j];
            k++;j++;
        }
        return mix;
    }


    //INPLACE MERGE 

    
    static void mergesortInplace(int[] arr,int s, int e) {
        if(e-s == 1){
         return;
        }
        int mid=(s+e)/2;
        mergesortInplace(arr,s, mid);
        mergesortInplace(arr,mid,e);
        mergeInplace(arr,s,mid,e);
     }
 
    static void mergeInplace(int[] arr, int s,int m, int e) {
 
         int i=s,j=m,k=0;
         int[] mix=new int[e-s];

         while(i< m && j< e){
             if(arr[i] < arr[j]){
                 mix[k]=arr[i];
                 i++;
             }
             else{
                 mix[k]=arr[j];
                 j++;
             }
             k++;
         }
 
         //it possible to have length of one array is grater then we simply copy that elements and paste in last of mix
         while(i<m){ //left one
             mix[k]=arr[i];
             k++;i++;
         }
 
         while(j<e){// for right one
             mix[k]=arr[j];
             k++;j++;
         }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l]=mix[l];
        }
     }

}
