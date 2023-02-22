class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=0;
        for(int per=0;per<accounts.length;per++){
            int sum=0;
            for(int account = 0; account<accounts[per].length ;account++){
                sum=sum+accounts[per][account];
                
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}