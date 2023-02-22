package CollectionFrameWorkBYAnujBhaiya;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkList_with_List {
    public static void main(String[] args) {
        //System.out.println("yyy");
       ArrayList<String> arrayList=new ArrayList<>();
       arrayList.add("yashn");
       //System.out.println(arrayList);

       List<Integer> list=new LinkedList<>();
       list.add(1);// add ele at last of list
       list.add(2);
       list.add(3);
       System.out.println(list);
       list.add(4);
       System.out.println(list);
       //adding to particular place using fun overloading
       list.add(2,777);
       System.out.println(list);

       //adding whole ele grom particular list

       List<Integer> newlist=new ArrayList<>();
       newlist.add(111);
       newlist.add(222);

       list.addAll(newlist);// addding in new list current list
       System.out.println(list);

       //get ele from particular index
       System.out.println(list.get(2));

       //remove ele from particular index
       list.remove(1);
       
       System.out.println(list);

       //reove with val
       list.remove(Integer.valueOf(777));
       System.out.println(list);

       //clar the all list
    //    list.clear();
    //    System.out.println(list);

    //Update value in the list
    list.set(4, 999);
    System.out.println(list);
    
    //contains in the list
    System.out.println(list.contains(99)); //trur or false

    //Itegrater

    // for(int i=0;i<list.size();i++){
    //     System.out.println(list.get(i));
    // }

    // for(Integer ele:list){
    //     System.out.println(ele);
    // }

    // Iterator<Integer> it= list.iterator();// return itertor for that list
    // while(it.hasNext()){
    //     System.out.println("it "+it.next());
    // }

    
    }
}
