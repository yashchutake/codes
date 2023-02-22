class Solution {
    public int numIdenticalPairs(int[] nums) {
       int n=nums.length;
       int gcount=0;
        for(int i=0;i<n;i++)
        {
             for(int j=0;j<n;j++)
             {
               if(j>i){
                     if(nums[i]==nums[j]){
                     gcount++;
                     }
                  }
             } 
        }
        return gcount;
    }
}