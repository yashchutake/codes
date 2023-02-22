package Recursion;

public class BSusingRecursion {
    public static void main(String[] args) {
        int [] arr={12,34,55,66,75,94};
        int s=0;
        int e=arr.length-1;
        int target=75;

        System.out.println(search(arr, target, s, e));
    }
    
    static int search(int[] arr, int target, int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }

        if(target > arr[mid]){
            return search(arr, target, mid+1, e);//right
        }

        return search(arr, target, s,mid-1);//left


    }
}
