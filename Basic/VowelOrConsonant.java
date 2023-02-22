import java.util.*;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a char");
        char ch=ip.next().charAt(0);
        if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
            System.out.println("This Vowel");
        }
        else{
            System.out.println("This Consonant");
        }
    }
}
