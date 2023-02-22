import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter Price and Discount in Per");
        float price=ip.nextFloat();
        float dper=ip.nextFloat();
        float diss=(dper*price)/100;
        System.out.println("disscount 0f "+dper+"%"+  "for price="+price+"is=="+diss);

    }
}
