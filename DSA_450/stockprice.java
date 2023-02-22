package DSA_450;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

public class stockprice {
    public static void main(String[] args) {
        int[] arr2=new int[Integer.MAX_VALUE];
        int[] arr={7,1,5,3,6,4};
        int max= maxprofit(arr);
        System.out.println (max); 
        //  maxProfit(arr);   
        //  List<Integer> list=new ArrayList<>();
        //  for(int ele:arr){
        //     list.add(ele);
        //  }
        //System.out.println (maxProfit(list)); 

    }

     static int maxprofit(int[] arr) {
        int min=arr[0];
        int maxp=0;

        for(int ele:arr){
            min=Math.min(min,ele);
            maxp=Math.max(maxp,ele-min);
        }
        
        
        return maxp;
    }
    //  static int maxProfit(List<Integer> list) {
        
    //     int minval=Collections.min(list);
    //     //System.out.println(minval);
    //    // int minind=Collections.binarySearch(list, minval);
    //     int max=list.get(0);

    //     for(int i=0;i<list.size();i++){
    //         minval=Math.min(minval,list.get(i));
    //         max=Math.max(max,max-minval);

    //     }


        
        
    //     return max;
    // }
}
