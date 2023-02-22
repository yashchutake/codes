class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> spmat= new ArrayList<>();
        int rl=matrix.length;
        int cl=matrix[0].length;
        int top=0;
        int bottom=rl-1;
        int left=0;
        int right=cl-1;
        int dir=0;
        
        while(top<=bottom && left<=right){
            if(dir==0){
                for(int i=left;i<=right;i++){
                spmat.add(matrix[top][i]);
                }
                top++;
                dir=1;
            }
                
            else if(dir==1){
                for(int i=top;i<=bottom;i++){
                spmat.add(matrix[i][right]);
                }
                right--;
                dir=2;
            }    
            
              else if(dir==2){
                for(int i=right;i>=left;i--){
                spmat.add(matrix[bottom][i]);
                }
                bottom--;
                dir=3;
            }
            
              else if(dir==3){
                for(int i=bottom;i>=top;i--){
                spmat.add(matrix[i][left]);
                }
                left++;
                dir=0;
            }
                
        }
        return spmat;
        
    }
}