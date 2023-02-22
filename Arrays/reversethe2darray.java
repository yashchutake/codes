

import java.util.*;
public class reversethe2darray {
 // Java implementation of the above approach


  static int M = 3;
  static int N = 3;
  
  
  // Function to reverse
  // the given 2D arr[][]
  static void reverseArray(int arr[][])
  {
  
    // Traverse each row of arr[][]
    for (int i = 0; i < M; i++) {
  
      // Initialise start and end index
      int start = 0;
      int end = N - 1;
  
      // Till start < end, swap the element
      // at start and end index
      while (start < end) {
  
        // Swap the element
        int temp = arr[i][start];
        arr[i][start] = arr[i][end];
        arr[i][end] = temp;
  
        // Increment start and decrement
        // end for next pair of swapping
        start++;
        end--;
      }
    }
     // System.out.println("1st res= "+Arrays.toString(arr));

    for(int i=0;i<M;i++){
        for(int j=0;j<N;j++){
              if(arr [i][j]==0){
                 arr [i][j]=1; 
              }
            //   if(arr [i][j]==1){
            //     arr [i][j]=0; 
            //  }
            else{
            
                arr [i][j]=0; 
            }
       }
      }

    // Print the arr[][] after
    // reversing every row
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
   }
  
  // Driver Code
  public static void main(String[] args)
  {
     int arr[][] ={ {0,0,0},
                     {0,1,0},
                     {1,1,1}}; 
    //                { {1,1,0},
    //                 {1,0,1},
    //                 {0,0,0}};
  
    // Function call
    reverseArray(arr);

  }
  }
  
//   // This code is contributed by PrinciRaj1992
//      public static void main(String[] args) {
        
   
//     int [][] image={{1,1,0},
//                      {1,0,1}, 
//                       {0,0,0}   };
    
//     int y=image.length;
//     int n=y;
//    // System.out.println(n);
//     int [][] reverse=new int[n][n];
//     for(int i=0;i<y;i++){
//          n=y;
//           for(int j=0;j<reverse[i][j].length;i++){
//             reverse[i][n-1]=image[i][j];
//               n=n-1;
//     }
//     }
// }
// }
