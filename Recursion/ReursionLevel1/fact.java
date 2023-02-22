package Recursion.ReursionLevel1;

public class fact {
    public static void main(String[] args) {
        int ans=fact(5);
        System.out.println(ans);
    }
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }

    static int sum(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*sum(n-1);
    }
}
