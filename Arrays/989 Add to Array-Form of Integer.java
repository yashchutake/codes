class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        int n=num.length;
        List<Integer> ans=new LinkedList<>();
        
        for(int i=n-1;i>=0;i--){
           ans.add(0,(num[i]+k)%10);
           k=(num[i]+k)/10;
        }
        
        while(k>0){
          ans.add(0,k%10)  ;
            k=k/10;
        }
    
        
        return ans;
        
//         int temp=0;
//         for(int i=0;i<n;i++){
//             temp=num[i];
//             temp=temp*10;
            
//         }
    }
}