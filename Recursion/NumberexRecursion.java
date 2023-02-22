package Recursion;

public class NumberexRecursion {
    public static void main(String[] args) {
        number(1);
    }
    static void number(int n){
        if(n>10){
            return;
        } 
        System.out.println(n);
        // Recurssion
        //if same fun call again and again you trete as a separate call in a stack 
         number(n+1);// tail recurssion

    }
}
