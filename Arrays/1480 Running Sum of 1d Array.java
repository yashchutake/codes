class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int [] runningSum=new int[n];
         int sum=0;
        for(int i=0;i<n;i++){
            if(i==0){
                 runningSum[i]=nums[i];
               
            }            
                sum=sum+nums[i];//+nums[j];
                runningSum[i]=sum;          

        }
        return runningSum;
    }
}