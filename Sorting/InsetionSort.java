import java.lang.reflect.Array;
import java.util.Arrays;

public class InsetionSort {
    public static void main(String[] args) {
      int [] arr={5,2,-2,1,-211,-1,3,4,5,5,0};
      insertion(arr);
      System.out.println(Arrays.toString(arr));       
    }

    static void insertion(int[] arr) {
      for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j>0;j--){
           if(arr[j]<arr[j-1]){
            swap(arr,j,j-1);
           }
           else{
            break;
           }
        }
      }
    }

     static void swap(int[] arr, int first, int sec) {
      int temp=arr[sec];
      arr[sec]=arr[first];
      arr[first]=temp;
    }


}
