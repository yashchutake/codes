package DSA_450;

public class Swapnumber {
    private int y,z;
    public static void main(String[] args) {
        // int a=10;
        // int b=20;
        // swap(a,b);
        // System.out.println(a+" "+b);

        Swapnumber sn=new Swapnumber();
        sn.y=10;
        sn.z=20;
        sn.swap(sn.y,sn.z);
        System.out.println(sn.y+" "+sn.z);
    }
    static void swap(Swapnumber sn.){
        int temp=sn.y;
        sn.y=sn.z;
        sn.z=temp;
    }
}
