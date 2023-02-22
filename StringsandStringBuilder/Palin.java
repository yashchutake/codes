package StringsandStringBuilder;


import java.util.*;
public class Palin {
    public static void main(String[] args) {
        String s="absba";
        
        ///method 1
        
        // StringBuilder builder=new StringBuilder(s);
        // //System.out.println(builder.reverse());
        // String rev=builder.reverse().toString();
        // //System.out.println(builder);
        // if(s.equals(rev)){
        //     System.out.println("PALI");
        // }
        // else{
        //     System.out.println("Not PALI");
        // }
    
    //method 2

     System.out.println(pali("AKA"));
    
    
    
    
    }
    static boolean pali(String str){
        if(str==null || str.length()== 0){
            return true;
        }
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!= end){
                return false;
            }
        }
         return true;
    }
}
