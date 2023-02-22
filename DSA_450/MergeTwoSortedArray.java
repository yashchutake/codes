package DSA_450;
import java.util.*;
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] ={1,8,4,25};
        int arr2[] = {2,7,10,12,3};
  
         Arrays.sort(arr1);
         Arrays.sort(arr2);
  
        int max=Integer.max(arr1.length,arr2.length);
        for(int i=0 ; i<max;i++){
          merge(arr1,arr2);
        }
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println();
        System.out.println(Arrays.toString(arr2));
    }

    private static void merge(int[] arr1, int[] arr2) {
        int i=0, j=0;
        while (i < arr1.length){
          if(arr1[i] > arr2[j]){
            int temp=arr2[j];
            arr2[j]=arr1[i];
            arr1[i]=temp;
            i++;j++;
            continue;
          }
            i++;
        }
      }
}
