package StringsandStringBuilder;

public class PerformanceAndSB {
    public static void main(String[] args) {
     // Not GOOD
     //Because new  String object is created every time so it consumem lot of memory
     //So much memory consumtion
     //O(n2)

         String s="";

         for (int i=0;i<26;i++){
            char ch=(char)('A'+i);
            s=s+" "+ch;//s+=ch;
        }
        System.out.println(s);//

    
    // optimed way using a string builder
    //only change the orginal object 
    //mutable
    StringBuilder builder=new StringBuilder();

    for (int j=0;j<26;j++){
        char ch=(char)('A'+j);
        builder.append(ch);
       // s=s+" "+ch;//s+=ch;
    }
    System.out.println(builder);//
    System.out.println(builder.reverse());
    System.out.println(builder.capacity());
   // System.out.println(builder.



    }
}
