package Recursion.SubsetsetSubSequenceStrings;

public class stringsstramrepeaty {
    public static void main(String[] args) {

        // TC IS = SIZE OF STRING

        String ans="bacapplecad";
        //using argumnemys
        //RemoveDub(" ",ans);    
       // System.out.println(ans);

       //Withoout using any extra arguments
       // System.out.println(RemoveDubOne(ans));    
        // System.out.println(ans);


        //want remove any substring from stringusing recusiion
        System.out.println(RemoveApple(ans));  
        System.out.println(RemoveAppNotApple(ans));  
     }
 
     private static void  RemoveDub(String p, String org) {
         if(org.isEmpty()){
             System.out.println(p);
             return ;
         }
         
         char ch=org.charAt(0);
         if(ch=='a'){
            RemoveDub(p,org.substring(1));
 
         }
         else{
            RemoveDub(p+ch, org.substring(1));
         }
 
     }


     private static String  RemoveDubOne(String org) {
        if(org.isEmpty()){
            
            return " ";
        }
        
        char ch=org.charAt(0);
        if(ch=='a'){
           return RemoveDubOne(org.substring(1));

        }
        else{
           return ch+RemoveDubOne(org.substring(1));
        }

    }


    private static String  RemoveApple(String org) {
        if(org.isEmpty()){  
            return " ";
        }
        
        char ch=org.charAt(0);
        if(org.startsWith("apple")){
           return RemoveApple(org.substring(5));

        }
        else{
           return ch+RemoveApple(org.substring(1));
        }

    }

    private static String  RemoveAppNotApple(String org) {
        if(org.isEmpty()){  
            return " ";
        }
        
        char ch=org.charAt(0);
        if(org.startsWith("app") && ! org.startsWith("apple")){
           return RemoveAppNotApple(org.substring(3));

        }
        else{
           return ch+RemoveAppNotApple(org.substring(1));
        }

    }
    
}
