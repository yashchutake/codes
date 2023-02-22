package Recursion;
public class FiboRecurssion {
    public static void main(String[] args) {
    //     int ans=fibo(50);
    //    System.out.println(ans);
     
       //using the formula function
       //find in the video with derivation
       for(int i=1;i<10;i++){
        System.out.println(fiboformula(i));
       }

           //    Scanner sc=new Scanner(System.in);
    //    int y=sc.nextInt();
    //    System.out.println(fiboformula(y));

    }

    static int fiboformula(int n){
        //just for demo use long instead for ans  exeeted
        return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }

    static int fibo(int n){
        if(n<2)
        {
            return n;
        }
        return fibo(n-1)+fibo(n-2);// RECURNCE RELATION //not tail reusion
    }
}
