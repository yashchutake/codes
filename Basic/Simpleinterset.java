import java.util.Scanner;

public class Simpleinterset {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        float p=ip.nextFloat();
        float r=ip.nextFloat();
        float t=ip.nextFloat();

        float i=p*(r/100)*t;
        System.out.println(i);
    }
}
