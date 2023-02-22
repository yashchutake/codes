class Solution {
    public int minCostToMoveChips(int[] position) {
        int n=position.length;
        int even=0;
        int odd=0;
        for (int i=0;i<n;i++){
            if(i%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
            if(even==n || odd==n){
            return 0;
            }
            return Math.min(even,odd);
        
    }
}

//2nd method
// class Solution {
//   public int minCostToMoveChips(int[] chips) {
//     int[] count = new int[2];

//     for (int chip : chips)
//       ++count[chip % 2];

//     return Math.min(count[0], count[1]);
//   }
// }