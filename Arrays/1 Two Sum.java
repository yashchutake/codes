class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        int res[]=new int[2];
        for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i!=j){
                    sum=nums[i]+nums[j];
                        if(sum==target){
                            res[0]=i;
                            res[1]=j;
                        }
                    }
        }

        }
         return res;
    }
   
}