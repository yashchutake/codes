import java.util.*;
public class FactorialOfNo
 {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a no to find factorial of a no");
        int n=ip.nextInt();
       //  int fa=0;
        Fact(n);
      
    }
     static void Fact(int n) {
         int fact=1;
           for(int i=n;i>=1;i--){
            fact=fact*i;
           }
          System.out.println("factorial of "+n+" is="+fact);
    }
 
}
