import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumberDissapperInArray {
    public static void main(String[] args) {
    int [] arr={4,3,2,7,8,2,3,1};
    List<Integer> list=new ArrayList<Integer>();
    list=findDisappearedNumbers(arr);
    //cyclicsort(arr);
    System.out.println(list);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        
        cyclicsort(nums);
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i] != i+1){
               list.add(i+1);
           }
        } 
        return list;
    }
        static void cyclicsort(int [] arr){
        int i=0;
        while(i<arr.length){
            int correctpos=arr[i]-1;
            if(arr[correctpos] != arr[i]){
                swap(arr,correctpos,i);

            }
            else{
                i++;//move forward
            }
        }
    }

     static void swap(int[] arr, int correctpos, int i) {
            int temp=arr[correctpos];
            arr[correctpos]=arr[i];
            arr[i]=temp;
    }
    

}