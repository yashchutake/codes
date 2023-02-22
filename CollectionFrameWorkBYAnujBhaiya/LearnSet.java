package CollectionFrameWorkBYAnujBhaiya;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        //hasset
        //Set<Integer> hs=new HashSet<>(); //hasing use
        //Set<Integer> hs=new LinkedHashSet<>();//order maintain because of the link list
        Set<Integer> hs=new TreeSet<>();// bineary search tree + set

          
        hs.add(2);
        hs.add(21);
        hs.add(12);
        hs.add(34);
        hs.add(99);
        hs.add(0);

        System.out.println(hs);

        hs.remove(21);
        System.out.println(hs);

        System.out.println(hs.contains(99));

        System.out.println(hs.isEmpty());

        System.out.println(hs.size());



        

        hs.clear();
        System.out.println(hs);
        


        //learning making for custom class
        Set<Student> stset=new HashSet<>();
        stset.add(new Student("Yash", 1));
        stset.add(new Student("Shant", 3));
        stset.add(new Student("Aman", 2));
        stset.add(new Student("Yash1", 1));
        System.out.println(stset);
    
        Student s1=new Student("Yash", 1);
        Student s2=new Student("Aka", 1);
        System.out.println(s1.equals(s2));
    }
}
