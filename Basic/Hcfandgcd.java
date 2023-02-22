import java.util.*;

public class Hcfandgcd {
    public static void main(String[] args) {
        int n1,n2,min,gcd=0,lcm;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two no");
        n1=sc.nextInt();
        n2=sc.nextInt();
        min=Math.min(n1,n2);
        for(int i=1;i<=min;i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        System.out.println("gcd="+gcd);
        
        lcm=(n1*n2)/gcd;
        System.out.println("lcm="+lcm);
        
    }
}
