package StringsandStringBuilder;

import java.util.ArrayList;

public class Opretor {
    public static void main(String[] args) {
        System.out.println('a'+'b');//add assci value of both
        System.out.println("a"+'b');//
        System.out.println("a"+"b");//
        System.out.println((char)('a'+3));//
        System.out.println("a"+1);//Integer will convert to integer which will call toString method

        //In Java The + Opertor is Overloaded for String only
        System.out.println("YASh"+new ArrayList<>());//
        System.out.println("Yash"+new Integer(45));//
        System.out.println(new Integer(34)+""+new ArrayList<>());//
    
    }
}
