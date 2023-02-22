import java.util.*;
public class Luckyno {
    public static void main(String[] args) {
      ////////////////////////////////////////////
//       import java.util.*;
// class Solution {
//     public List<Integer> luckyNumbers (int[][] matrix) {
        int[][] matrix={{3,7,8},
                        {9,11,13},
                        {15,16,17}};
        int rl=matrix.length;
        int cl=matrix[0].length;
        int [] rowmin=new int[rl];
        int [] colmax=new int[cl];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        // int min=int.MaxValue;
        // int max=int.MinValue;
        // ArrayList<Interger> min=new ArrayList<>();
        int ind=0;
        for(int i=0;i<rl;i++){
             for(int j=0;j<cl;j++){
                min=Math.min(min,matrix[i][j]);
                System.out.println("i and j "+i+" "+j);
        }
            rowmin[ind++]=min;
            System.out.println("index "+ind+" "+"Min "+min);
           // ind++;
        }
        
         ind=0;
        
       for(int j=0;j<cl;j++){
             for(int i=0;i<rl;i++){
                max=Math.max(max,matrix[i][j]);
                System.out.println("i and j "+i+" "+j);
        }
          colmax [ind++]=max;
          System.out.println("index "+ind+" "+"Max "+max);
         // ind++;
        }
        
        List <Integer> ans=new LinkedList<>();
        for(int i=0;i<rl;i++){
             for(int j=0;j<cl;j++){
                // System.out.println("hello");
             if(rowmin[i]==matrix[i][j] && colmax[j]==matrix[i][j])
             {
                System.out.println("hello");
             ans.add(matrix[i][j]);
             //ans.add(rowmin[j]);
             }
        }
           
        }
        
        // return ans;
        System.out.println(ans);
        

      ///////////////////////////////////////////  
    }
}
