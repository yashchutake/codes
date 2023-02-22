import java.util.*;

public class Armstomeno {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int temp=n;
        int s=0,r;
        while(n>0){
            r=n%10;
            s=s+r*r*r;
            n=n/10;
        }
        if(s==temp){
            System.out.println("Armstome");
     } 
     else{
        System.out.println(" Not Armstome");
     }

    }
}
