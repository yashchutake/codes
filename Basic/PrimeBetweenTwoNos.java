import java.util.*;
public class PrimeBetweenTwoNos {

    static boolean isPrime(int a) {

        boolean flag=true;
     if(a==0 || a==1){
        flag=false;
        //System.out.println("not prime ahe bro"); 
        return false; 
     }
        else{
         
        for(int i=2;i<=a/2;++i){
            if(a%i==0){
                flag=false;
               // System.out.println("not prime ahe bro");
               //System.out.println();
               return false; 
               // break;
            }
        }
    }
        
        if(flag){          
             System.out.println(a);
             return true;
        }
        // else{
        //     System.out.println("not prime ahe bro");
        return true;
           
        // }
    }
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("enter a two between you want to find find a prime nos");
        int n1=ip.nextInt();
        int n2=ip.nextInt();
        System.out.println("The prime no between "+n1+" and "+n2+" are =");
        for(int i=n1;i<=n2;i++){
            isPrime(i);
        }
        //  isPrime(n);

    }
 

}
