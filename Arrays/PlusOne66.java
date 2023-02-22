import java.util.*;
public class PlusOne66 {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        // int [] dig={1,2,3};
         int[] a = plusOne({1,2,3});
         System.out.println(plusOne({1,2,3}));


        // int [] dig={9};
        // for(int i=dig.length-1;i>=0;i--){
        //     if(dig[i]<9){
        //         dig[i]++;
        //         // System.out.println(dig.toString());
        //         for(int ele:dig){
        //             System.out.print("dig="+ele);
        //         }
        //     } 
        //         dig[i]=0;
        //     }
        //     System.out.println();
        //     int[] res=new int[dig.length+1];
        //     res[0]=1;
        //     for(int ele:res){
        //         System.out.print("res="+ele);
        //     }
        }

    }
