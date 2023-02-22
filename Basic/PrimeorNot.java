import java.util.*;
public class PrimeorNot {

    static void isPrime(int a) {

        boolean flag=true;
     if(a==0 || a==1){
        flag=false;
        System.out.println("not prime ahe bro");  
     }
        else{
         
        for(int i=2;i<=a/2;++i){
            if(a%i==0){
                flag=false;
                System.out.println("not prime ahe bro");
                break;
            }
        }
    }
        
        if(flag){
          
             System.out.println("prime ahe bro");
        }
        // else{
        //     System.out.println("not prime ahe bro");
           
        // }
    }
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("enter a no");
        int n=ip.nextInt();
        
         isPrime(n);

    }
 

}
