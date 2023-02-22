import java.lang.reflect.Array;
import java.util.Arrays;


public class Twodmatrixsearch {
    public static void main(String[] args) {
        //System.out.println("df");
        int[][] mat ={
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50},
            // {35,36,37,60},
        };
        System.out.println(Arrays.toString(search(mat, 33)));
    }
    static int[] search(int [][] mat,int target){
      int r=0;
      int c=mat.length-1;
    //  int c=3;
    //  System.out.println(c);
      while(r<mat.length && c>=0){
        if(mat[r][c]==target){
            return new int[]{r,c};
        }
        else if(mat[r][c] < target){
            r++;
        }
        else{
            c--;
        }
        
      }
        
        
      return new int[]{-1,-1};
    }
}
