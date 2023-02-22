class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
         int totalele=mat.length * mat[0].length;
         
        
     if(totalele!=r*c || totalele%r !=0 ){
         return mat;
     }
        
        int [][] res=new int[r][c];
        int newr=0;
        int newc=0;
        
     for(int i=0;i<mat.length;i++){
         for(int j=0;j<mat[i].length;j++){
          res[newr][newc]=mat[i][j];
             newc++;
             if(newc==c){
                 newc=0;
                 newr++;
             }
          
      }
     }
     // int res[i]=mat[c*i+j];
        return res;
   
}
}