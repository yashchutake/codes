import java.util.Scanner;

public class Fiboser {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter no upto which you want a fb series");
        int n=ip.nextInt();
        int n0=0;
        int n1=1;
        int n3=0;
        System.out.print(n0+" "+n1);
        for(int i=2;i<=n;i++){
            n3=n0+n1;
            System.out.print(" "+n3);
            n0=n1;
            n1=n3;
        }
    }
}
