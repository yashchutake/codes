class Solution {
    public int[][] transpose(int[][] matrix) {
        int n=matrix.length;
        int [][] res=new int[matrix[0].length][n];
        for(int i=0;i<n;i++){
         for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                res[i][j]=matrix[i][j];
                }
             else{
                 res[j][i]=matrix[i][j];
             }
                    
                
        }
        }
        return res;
        
    }
}