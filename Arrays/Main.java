
import java.net.Inet4Address;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main
{
public static void main(String[] args) {
   
    Scanner sc=new Scanner(System.in);
   
    System.out.println("No of mail ");  
    int n=sc.nextInt();
   
    String[] string = new String [n+1];
   
    boolean a,b,c,d;
   
    int g, h, r, y;
  g=0;
  h=0;
  r=0;
  y=0;
   
  System.out.println("Please the mails");
    for (int i = 0; i < string.length; i++)  
    {  
    string[i] = sc.nextLine();  
    }  



System.out.println("\nYou have entered: ");  
    for(String str: string)  
    {  
    System.out.println(str);  
    }  
   
   
   
    for(String str: string)  
    {  

      //  System.out.println(vailEmail(str));
        a=str.contains("@gmail.com");
       
       
        b=str.contains("@hotmail.com");
         
       

        c=str.contains("@yahoo.com");
         
       
       
        d=str.contains("rediffmail");

     //   vailEmail(str);
         
         
         if(a && vailEmail(str)){
         g++;
       
        }
        if(b && vailEmail(str)){
           
            h++;
        }
       
        if(c && vailEmail(str)){
            y++;
        }
        if(d && vailEmail(str)){
            r++;
        }
        // if(vailEmail(str)){
            // System.out.println("gmail="+g);
           
        
            // System.out.println("hotmail="+h);
            //     System.out.println("yahoo="+y);
            //         System.out.println("rediffmail="+r);
       
    // }

//     for(String str: string)  
//     { 
//    if(vailEmail(str)){

//    }
}
         System.out.println("gmail="+g);
           
        
            System.out.println("hotmail="+h);
                System.out.println("yahoo="+y);
                    System.out.println("rediffmail="+r);
               
               

}

public static boolean vailEmail(String input){
    String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"; 
    Pattern emailPat=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
    Matcher matcher=emailPat.matcher(input);
    return matcher.find();
}
  


}
