import java.util.*;
public class SumOfFirstNnos {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the n no");
        int n=ip.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum="+sum);
    }
}
