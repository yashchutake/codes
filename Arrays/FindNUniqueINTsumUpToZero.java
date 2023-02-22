import java.util.*;
public class FindNUniqueINTsumUpToZero {

    public static int[] sumZero(int n) {
        int[] v = new int[n];
        for(int i=0;i<n;i++)
           { 
               v[i]= 2*i - n + 1;
            System.out.println("for i and n ="+i+" and "+n+"="+v[i]);
           }
            return v;
    }

    public static void main(String[] args) {
        
              int[] output = sumZero(8);
              for(int i=0;i<8;i++)
                System.out.print(output[i]+" ");
            
        }
    }

