package Recursion.SubsetsetSubSequenceStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsInterativeArr {
    public static void main(String[] args) {
        int[] arr={1,2,1};
        // List<List<Integer>> list=subset(arr);
        // System.out.println(list);
        
        //DUBLICATE
        List<List<Integer>> list=subsetDub(arr);
        System.out.println(list);
    
    }

    private static List<List<Integer>> subset(int[] arr) {
       List<List<Integer>> outer=new ArrayList<>();
       outer.add(new ArrayList<>());

       for(int num:arr){
        int n=outer.size();
        for (int i = 0; i < n; i++) {
            List<Integer> internal=new ArrayList<>(outer.get(i));
            internal.add(num);
            outer.add(internal);
        }
       }
        return outer;
    }

    //Dublicate

    private static List<List<Integer>> subsetDub(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        
        int start=0;
        int end=0;

        for (int i = 0; i < arr.length; i++) {
            start=0;
            //if current and previous ele is same s=e+1
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
         for (int j = start; j < n; j++) {
             List<Integer> internal=new ArrayList<>(outer.get(j));
             internal.add(arr[i]);
             outer.add(internal);
         }
        }
         return outer;
     }







}
