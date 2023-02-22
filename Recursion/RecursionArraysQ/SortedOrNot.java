package Recursion.RecursionArraysQ;



public class SortedOrNot {
    public static void main(String[] args) {
        int arr[]={1,2,13,4,8,9};
       System.out.println(issorted(arr ,0));    
    }

    private static boolean issorted(int[] arr, int index) {
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] &issorted(arr, index+1);
    }







    
//     private static boolean issorted(int[] arr) {
//         int arr2[]=new int[arr.length];
//         for(int i=0;i<arr.length;i++){
//         if(i<arr.length-1){
//             arr2[i]=arr[i+1];
           
//         if(arr[i] < arr[i+1] && issorted(arr2)){
//             return true;
//         }
//          }

//         }
//    return false;
//     }

}
