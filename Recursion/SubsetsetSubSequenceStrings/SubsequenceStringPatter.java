package Recursion.SubsetsetSubSequenceStrings;

import java.util.ArrayList;

import org.w3c.dom.xpath.XPathResult;

public class SubsequenceStringPatter {
    public static void main(String[] args) {
        //Subsequece("","abc");

        //PASSING IN THE ARGUMENTS
        // ArrayList<String> list=new ArrayList<>();   
        //SubsequeceList("","abc",list);
        //System.out.println(list);

        // WITHOUT PASSING IN THE ARGUMENTS
        // ArrayList<String> list=new ArrayList<>(); 
        // list=SubsequeceList2("","abc");
        // System.out.println(list);

        // WITH ASCII VALUE COBINATION
        // SubsequeceASCII("","abc");

         // ASCII WITHOUT  PASSING IN THE ARGUMENTS
        ArrayList<String> list=new ArrayList<>(); 
        list=SubsequeceASCII2("","abc");
        System.out.println(list);
          
    }
     
    //recursion all possible subsequece of string using the reusion

    // private static void Subsequecelist(String string, String string2, ArrayList<String> list) {
    // }

    

   

    private static void Subsequece(String p, String up) {
       if(up.isEmpty()){
        System.out.println(p);
        return;
       }
       char ch=up.charAt(0);
       Subsequece(p+ch, up.substring(1)); //left run first TAKE IT
       Subsequece(p, up.substring(1)); //right  NOT TAKE IT
    }

            //PASSING IN THE ARGUMENTS

    private static void SubsequeceList(String p, String up,ArrayList<String> list) {
        if(up.isEmpty()){
          list.add(p);
         //System.out.println(p);
          return;
        }
        char ch=up.charAt(0);
        SubsequeceList(p+ch, up.substring(1),list); //left run first TAKE IT
        SubsequeceList(p, up.substring(1),list); //right  NOT TAKE IT
     }


             // WITHOUT PASSING IN THE ARGUMENTS

     private static ArrayList<String> SubsequeceList2(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            //System.out.println(p);
            return list;
           }
           char ch=up.charAt(0);
           ArrayList<String> left=SubsequeceList2(p+ch, up.substring(1)); //left run first TAKE IT
           ArrayList<String> right=SubsequeceList2(p, up.substring(1)); //right  NOT TAKE IT
           
           left.addAll(right);
           return left;
    }

    // WITH ASCII VALUE COBINATION

    private static void SubsequeceASCII(String p, String up) {
        if(up.isEmpty()){
         System.out.println(p);
         return;
        }
        char ch=up.charAt(0);
        SubsequeceASCII(p+ch, up.substring(1)); //left run first TAKE IT
        SubsequeceASCII(p, up.substring(1)); //right  NOT TAKE IT
        SubsequeceASCII(p+(ch+0), up.substring(1)); //taking ascii value
    }

    
    private static ArrayList<String> SubsequeceASCII2(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            //System.out.println(p);
            return list;
           }
           char ch=up.charAt(0);
           ArrayList<String> left=SubsequeceASCII2(p+ch, up.substring(1)); //left run first TAKE IT
           ArrayList<String> right=SubsequeceASCII2(p, up.substring(1)); //right  NOT TAKE IT
           ArrayList<String> asc=SubsequeceASCII2(p+(ch+0), up.substring(1)); //right  NOT TAKE IT

           left.addAll(right);
           left.addAll(asc);
           return left;

    }

}
