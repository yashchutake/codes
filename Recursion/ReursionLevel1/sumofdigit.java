package Recursion.ReursionLevel1;

import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       
        System.out.println(muldig(num));
        
    }
    static int sumdig(int n){
        if(n==0){
            return 0;
        }
        System.out.println("n%10="+n%10);
        System.out.println("n/10="+n/10);
        return n%10+sumdig(n/10);
       
    }

    static int muldig(int n){
        if(n%10==n){
            return n;
        }
        System.out.println("n%10="+n%10);
        System.out.println("n/10="+n/10);
        return n%10*sumdig(n/10);
       
    }

}
