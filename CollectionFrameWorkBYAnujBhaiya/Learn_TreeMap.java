package CollectionFrameWorkBYAnujBhaiya;

import java.util.Map;
import java.util.TreeMap;

public class Learn_TreeMap {

    public static void main(String[] args) {
        Map<String,Integer> tm=new TreeMap<>();
        tm.put("One",1);
        tm.put("ATwo",2);
        tm.put("Three",3);
        tm.put("Four",4);
        tm.put("Five",5);
        
        tm.remove("Four");//remove any key

        
        System.out.println(tm);//print in the sorted order of keys

       

        //tm.put("One",111); //override with and upadate new value
        //System.out.println(tm);

        //Check value Prent or not
        System.out.println(tm.containsValue(5));
        System.out.println(tm.isEmpty());
        System.out.println(tm.replace("Four", 460));
        System.out.println(tm);
        tm.clear();
        System.out.println(tm);
        //not want to update if present
        if(!tm.containsKey("Five")){
            tm.put("Five", 565);
        }

       // System.out.println(tm);
      //Or

      //  tm.putIfAbsent("Yash", 999);
      //  System.out.println(tm);


      //Iterate Throgh Map or enteres
      //Entery Class
      //enteryset return set of enters present

      for(Map.Entry<String,Integer> e:tm.entrySet()){
        // System.out.println(e);//print enterys
        // System.out.println(e.getKey());  //print keys only
        // System.out.println(e.getValue());  //print keys only

    }

    // Iterate Throh=gh keys only
    for(String key:tm.keySet()){
        //System.out.println(key);  //print keys only
    }


    // Iterate Throh=gh values only

    for(Integer val:tm.values()){
        //System.out.println(val);  //print keys values

    }




    }
}


