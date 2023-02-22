import java.util.*;
public class InfIpSum{
    public static void main(String[] args) {
        int num,sum=0;
        Scanner sc=new Scanner(System.in);   
       while(sc.hasNextInt())
       {
          num=sc.nextInt();
          sum=sum+num; 
       }
       System.out.println("sum="+sum);
    }
}