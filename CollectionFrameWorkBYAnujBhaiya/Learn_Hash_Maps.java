package CollectionFrameWorkBYAnujBhaiya;

import java.util.HashMap;
import java.util.Map;

public class Learn_Hash_Maps {
    public static void main(String[] args) {
        Map<String,Integer> hm=new HashMap<>();
        hm.put("One",1);
        hm.put("Two",2);
        hm.put("Three",3);
        hm.put("Four",4);
        hm.put("Five",5);

        hm{"One];
        
        //hm.remove();//remove any key
        
        System.out.println(hm);


        //hm.put("One",111); //override with and upadate new value
        //System.out.println(hm);

        //Check value Prent or not
        System.out.println(hm.containsValue(5));
        System.out.println(hm.isEmpty());
        System.out.println(hm.replace("Four", 460));
        System.out.println(hm);
        hm.clear();
        System.out.println(hm);
        //not want to update if present
        if(!hm.containsKey("Five")){
            hm.put("Five", 565);
        }

       // System.out.println(hm);
      //Or

      //  hm.putIfAbsent("Yash", 999);
      //  System.out.println(hm);


    //Iterate Throgh Map or enteres
      //Entery Class
      //enteryset return set of enters present

      for(Map.Entry<String,Integer> e:hm.entrySet()){
        // System.out.println(e);//print enterys
        // System.out.println(e.getKey());  //print keys only
        // System.out.println(e.getValue());  //print keys only

    }

    // Iterate Throh=gh keys only
    for(String key:hm.keySet()){
        //System.out.println(key);  //print keys only
    }


    // Iterate Throh=gh values only

    for(Integer val:hm.values()){
        //System.out.println(val);  //print keys values

    }




    }
}
