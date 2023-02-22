import java.util.Scanner;

public class Factorsno {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int num=ip.nextInt();
        System.out.println("Factore for given no are ");
        int i;
        for(i=1;i<=num;i++)
        {
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
