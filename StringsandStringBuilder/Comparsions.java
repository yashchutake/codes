package StringsandStringBuilder;

public class Comparsions {
    public static void main(String[] args) {
        String a="Yash";
        String b="Yash";
        String c=b;
        System.out.println(a==c);//
        //System.out.println(a==b);//comparsing the actual obj
        
        String name1=new String("Yasha");
        String name2=new String("Yasha");
        //compartetor
        System.out.println(name1==name2);//Even value is same but pointing to difeernt obj because of we explictevley mentioned
    
        //Only Compare the values
        // mrthod or function
        //function in classes are known as method
        //only care about value not about the object through it pointing
        System.out.println(name1.equals(name2));//
        System.out.println(name1.charAt(0));//
    }
}
