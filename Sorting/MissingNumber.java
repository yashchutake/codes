import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
      //  int no=0;
      HashSet set=new HashSet<>();
    //  List<Integer> arrr=new ArrayList<Integer>();
      List<Integer> listyash=new ArrayList<Integer>();
        int[] arr={4,3,2,7,8,2,3,1};
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
           // arrr.add(arr[i]);
        }
        Object[] newarr=set.toArray();
        System.out.println(set);
        System.out.println(Arrays.toString(newarr));
        listyash=findDisappearedNumbers(arr);
        //int no=missingNumber(arr);
        System.out.println(listyash);
    }





   public static List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> list=new ArrayList<Integer>();
    
   // Arrays.sort(nums);
    for(int i=0;i<nums.length;i++)
    {
       if(nums[i] != i+1){
           list.add(i+1);
       }
       // else{
       //     list.add(nums.length);
       // }
    } 
    return list;
}


}


/*


package com.kunal;
// https://leetcode.com/problems/missing-number/
// Amazon Question
class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // case 2
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
} 


 */
