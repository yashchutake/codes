import java.util.*;
public class Reversein90 {
    public static void main(String[] args) {
        // //////////////
        int mat[][] ={ {0,0,0},
        {0,1,0},
        {1,1,1}};

        int target[][] ={ {1,1,1},
        {0,1,0},
        {0,0,0}};

        boolean yash= findRotation(mat,target);
        System.out.println(yash);
        
    }
/////////////////////////////////////////////////

    public static boolean findRotation(int[][] mat, int[][] target) {
            int M = mat.length;
           int N = mat[0].length;
           int temp=0;
        //    System.out.println("1st len= "+M);
        //    System.out.println("1st len= "+N);
        // public class reversethe2darray {
 // Java implementation of the above approach
    for (int i = 0; i < 4; ++i) {
      if (Arrays.deepEquals(mat, target)) {
          return true;
      }
      //rotate(mat);///////////////////////////////////////
  //        void rotate(int arr[][])
  // {
   // int M = mat.length;
   // int N = mat[0].length;;
    // Traverse each row of arr[][]
    for (int y = 0; y < M; y++) {
  
      // Initialise start and end index
      int start = 0;
      int end = N - 1;
  
      // Till start < end, swap the element
      // at start and end index
      while (start < end) {
  
        // Swap the element
       // int
         temp = mat[y][start];
        mat[y][start] = mat[y][end];
        mat[y][end] = temp;
  
          
        // Increment start and decrement
        // end for next pair of swapping
        start++;
        end--;
      }
    }
     // System.out.println("1st res= "+Arrays.toString(target));

    for(int y=0;y<M;y++){
        for(int j=0;j<N;j++){
              if(mat [y][j]==0){
                mat [y][j]=1; 
              }
            //   if(arr [i][j]==1){
            //     arr [i][j]=0; 
            //  }
            else{
            
               mat [y][j]=0; 
            }
       }
      }
    //  System.out.println("1st res= "+Arrays.toString(mat));
    //Print the arr[][] after
    //reversing every row
      //each y th res
      System.out.println("rot="+i);
    for (int y = 0; y < M; y++) {
      for (int j = 0; j < N; j++) {
    System.out.print(mat[y][j] + " ");
      }
      System.out.println();
    }
   

      /////////////////////////////////////////////////////
    }
    //final res
    // for (int y = 0; y < M; y++) {
    //     for (int j = 0; j < N; j++) {
    //   System.out.print(mat[y][j] + " ");
    //     }
    //     System.out.println();
    //   }
        return false;
  }   
  

 
/////////////////////////////////////////////////
}
          