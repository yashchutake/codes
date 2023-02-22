package Recursion.SortingAndPatterns;

public class reversedecrease {
    public static void main(String[] args) {
        pattern(4, 0);
    }
    static void pattern(int r,int c){
        if(r==0){
            return;
        }   
        if(c<r){
            System.out.print("* ");
            pattern(r, c+1);
        }
        else{
           System.out.println();
           pattern(r-1, 0);
        }
    }

    static void pattern1rev(int r,int c){
        if(r==0){
            return;
        }   
        if(c<r){
            // System.out.print("* ");
            pattern(r, c+1);
            System.out.print("* ");
        }
        else{
        //    System.out.println();
           pattern(r-1, 0);
           System.out.println();
        }
    } 
}
