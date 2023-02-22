import java.util.*;
public class MaxMInMethod {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
       
        System.out.println("Enter 3 nos ");
        int num1=ip.nextInt();
        int num2=ip.nextInt();
        int num3=ip.nextInt();
        System.out.println("max= "+Maxoff(num1,num2,num3));
        System.out.println("min= "+Minoff(num1,num2,num3));
      //  Maxoff(num1,num2,num3);
       // Minoff(num1,num2,num3);
    }


    static int Maxoff(int a, int b, int c) {
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }

    static int Minoff(int a, int b, int c) {
        int min=a;
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        return min;
    }

} 

