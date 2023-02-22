package StringsandStringBuilder;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String n="Yash Chutake Kas Kay Bhau";
        System.out.println(Arrays.toString(n.toCharArray()));
        System.out.println(n.toLowerCase());
        System.out.println(n.indexOf('a'));
        System.out.println(n.lastIndexOf('a'));
        System.out.println(" ks dkf   s ffk lfd ".strip());
        System.out.println(" ks dkf   s ffk lfd ".trim());
        System.out.println(" ks dkf   s ffk;lfd ".replaceAll("\\s",""));
        System.out.println("   dk kfk ll l ".concat("yashhh"));
        System.out.println(Arrays.toString(n.split(" ")));
        System.out.println(Arrays.toString(n.split(" ",1)));
    }
}
