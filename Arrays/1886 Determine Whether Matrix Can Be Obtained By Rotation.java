class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
           //  int M = mat.length;
           // int N = mat[0].length;
        // public class reversethe2darray {
 // Java implementation of the above approach
    for (int i = 0; i < 4; ++i) {
      if (Arrays.deepEquals(mat, target)) {
          return true;
      }
      rotate(mat);
        ///////////////////////////////////////
  //        void rotate(int arr[][])
  // {
   // int M = mat.length;
   // int N = mat[0].length;;
    // Traverse each row of arr[][]
 
}
return false;
      /////////////////////////////////////////////////////
    }
        // return false;
      public static void rotate(int[][] M) {
    for (int i = 0, j = M.length - 1; i < j; ++i, --j) {
      int[] temp = M[i];
      M[i] = M[j];
      M[j] = temp;
    }
    for (int i = 0; i < M.length; ++i)
      for (int j = i + 1; j < M.length; ++j) {
        final int temp = M[i][j];
        M[i][j] = M[j][i];
        M[j][i] = temp;
      }
  }
    
  }   