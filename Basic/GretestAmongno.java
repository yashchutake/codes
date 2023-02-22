import java.util.*;
public class GretestAmongno {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
      //  int num=ip.nextInt();
        int sum=0;
        int num=10;
        int temp=0;
        while(num > 0){
            num=ip.nextInt();
            sum=sum+num;
           
            if(num>temp){
                temp=num;
            }

        }
        System.out.println("sum of no are "+sum);
        System.out.println("greteast of no are "+temp);
    }
}
