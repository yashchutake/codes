class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int temp=0;
        int len=0;
        int count=0;
        for(int i=0;i<n;i++){
            temp=nums[i];
            
            len=String.valueOf(temp).length();
            if(len%2==0){
                count++;
            }
        }
        return count;
    }
}