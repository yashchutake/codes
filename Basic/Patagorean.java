import java.util.*;
public class Patagorean {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int c=n%10;
        int rem=n/10;
        int b=rem%10;
        int rem1=rem/10;
        int a=rem1%10;
        if(c*c==(b*b)+(a*a))
            {
                System.out.println("No is Patagorean");
            }
            else{
                System.out.println("No Not a Patagorean");
            }
    }
}
