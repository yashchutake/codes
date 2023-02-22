import java.util.Scanner;

public class Evenodd {
   public static void main(String[] args) {
       Scanner ip=new Scanner(System.in);
       System.out.println("Enter a no ");
       int a=ip.nextInt();
       if(a%2==0){
           System.out.println("Even");
       }
       else{
        System.out.println("odd");
       }
   } 
}
