class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
         List<Boolean> list = new ArrayList<>();
        
        int n=candies.length;
        
        // boolean[] result = new boolean[n];
        // boolean result[]=new boolean[n];
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        
        
        //         for(int i = 0 ; i < candies.length ; i++){
        //     list.add((max - candies[i])<=extraCandies);
        // }
        // return list;
        
        
        for(int i=0;i<n;i++){
           if(candies[i]+extraCandies >= max){
              list.add(true);
           }
            else{
             list.add(false);
            }
        }
        
        return list;
    }
}