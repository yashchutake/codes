package CollectionFrameWorkBYAnujBhaiya;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.*;
public class Collection_Class {
    public static void main(String[] args) {
        // List<Integer> list=new ArrayList<>();
        // list.add(10);
        // list.add(1);
        // list.add(20);
        // list.add(404);
        // list.add(12);
        // list.add(9);
        // list.add(40);
        // System.out.println(list);
        
        // System.out.println(Collections.min(list));
        // System.out.println(Collections.max(list));
        // System.out.println(Collections.frequency(list,4));

        // System.out.println(list);

        // Collections.sort(list);
        // System.out.println(list);

        // Collections.sort(list,Comparator.reverseOrder());
        // System.out.println(list);
        
        // Collections.reverseOrder();
        // System.out.println(list);

        // Collections.shuffle(list);
        // System.out.println(list);

        // Collections.rotate(list, 10);
        // System.out.println(list);

        
        //For Custom Classes

        List<Student> s=new ArrayList<>();
        s.add(new Student("yash", 21));
        s.add(new Student("kas", 3));
        s.add(new Student("kay", 341));
        s.add(new Student("zs", 43));
        s.add(new Student("ay", 41));
        s.add(new Student("zop", 66));
        s.add(new Student("oo", 2));
        
        System.out.println(s);

        Student s1=new Student("Yash", 33);//this
        Student s2=new Student("Aka", 1);//that
        System.out.println(s1.compareTo(s2));//pos means this is big 

        // Collections.sort(s);
        // System.out.println(s);
    
        // Collections.sort(s,Comparator.reverseOrder());
        // System.out.println(s);


          //USING COMAPRATOR CUSTOM AND LAMBDA
          Collections.sort(s,new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                // TODO Auto-generated method stub
                return o1.name.compareTo(o2.name);
            }
            
         });

         
        //LAMBDA
       //  Collections.sort(s,(o1, o2) -> o1.name.compareTo(o2.name));
    
    
    
    
    }
}
