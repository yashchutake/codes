package Recursion.RecursionArraysQ;

import java.lang.annotation.Target;

public class RotedBS {
    public static void main(String[] args) {
        int arr[]={1,3,5,23,11,223,12,19};
        System.out.println(search(arr, 12, 0, arr.length));
    }
    static int search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;

     
        if(arr[m]==target){
            return m;
        }

        //search in first half
        if(arr[s] <= arr[m]){
            if(target >=arr[s] && target <=arr[m]){
                return search(arr, target, s, m-1);
            }
            else{
                return search(arr, target, m+1, e);
            }
        }
        //search in secound half
        if(target >= arr[m] && target <= arr[e]){
            return search(arr, target, m+1, e);
        }
        return search(arr, target, s, m-1);
    }

}
