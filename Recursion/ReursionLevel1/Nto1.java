package Recursion.ReursionLevel1;

public class Nto1 {
    public static void main(String[] args) {
        //funBoth(5);
        // fun(5);
        // funrev(6);
        concept(5);
    }

    static void fun(int n) {

        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);

    }

    static void funrev(int n) {

        if (n == 0) {
            return;
        }
        funrev(n - 1);
        System.out.println(n);

    }
    
    static void funBoth(int n) {

        if (n == 0) {
            return;
        }
        System.out.println(n);
        funBoth(n - 1);
        System.out.println(n);

    }


    // COncept

    static void concept(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);
        concept(--n);
        
        

    }

}
