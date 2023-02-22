import java.util.*;
public class MaximumSubarray {
    public static void main(String[] args) {
               // [-2,1,-3,4,-1,2,1,-5,4]
        int [] a={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(a));
        
    }

    public static int maxSubArray(int[] nums) {
        int TempMax = nums[0];
        int FinalMax = nums[0];
        for (int i = 1; i < nums.length; i++){
            TempMax = Math.max((TempMax + nums[i]), nums[i]);
            FinalMax = Math.max(FinalMax, TempMax);
            System.out.println("for i "+i+" Tempmax="+TempMax+" FinalMax="+FinalMax);
        }
        return FinalMax;
    }
}
