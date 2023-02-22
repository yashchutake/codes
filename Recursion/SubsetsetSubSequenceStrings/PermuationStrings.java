package Recursion.SubsetsetSubSequenceStrings;

import java.util.ArrayList;

public class PermuationStrings {
    public static void main(String[] args) {
       //String str="abc";
    //    Permu("","abc");    


    //IN THR LIST
    // ArrayList<String> ans=new ArrayList<>();
    // ans=PermuList("","abc");
    // System.out.println(ans);      

    //COUNT 
    System.out.println(PermuCount("", "abcd"));    

}

    private static void Permu(String p,String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f=p.substring(0, i);
            String s=p.substring(i,p.length());
           // p=f+ch+s;

            Permu(f+ch+s, up.substring(1));// skip the first ones
        }
    }

    private static ArrayList<String>  PermuList(String p,String up) {
        if(up.isEmpty()){
            //System.out.println(p);
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        char ch=up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f=p.substring(0, i);
            String s=p.substring(i,p.length());
           // p=f+ch+s;

           ans.addAll(PermuList(f+ch+s, up.substring(1)));// skip the first ones
        }
        return ans;
    }

    private static int PermuCount(String p,String up) {
        if(up.isEmpty()){
            //System.out.println(p);
            return 1;
        }

        char ch=up.charAt(0);
        int count =0;
        for (int i = 0; i <= p.length(); i++) {
            String f=p.substring(0, i);
            String s=p.substring(i,p.length());
           // p=f+ch+s;

            count =count+PermuCount(f+ch+s, up.substring(1));// skip the first ones
        }
        return count;
    }
   


}
