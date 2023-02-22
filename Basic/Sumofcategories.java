import java.util.*;
public class GretestAmongno {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
      //  int num=ip.nextInt();
        int psum=0;
        int pnum=10;
        int ptemp=0;
        while(pnum > 0){
            pnum=ip.nextInt();
            psum=psum+pnum;
           
            if(pnum>ptemp){
                ptemp=pnum;
            }

        }
        System.out.println("sum of POSITIVE no are "+sum);
      //  System.out.println("greteast of no are "+temp);
    }
}
