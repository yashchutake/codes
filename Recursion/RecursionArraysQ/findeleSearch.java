package Recursion.RecursionArraysQ;

import java.util.ArrayList;

import Recursion.ReursionLevel1.reversenumUsingecussion;

public class findeleSearch {
    public static void main(String[] args) {
        int arr[]={4,1,2,8,4,13,4,4};
        System.out.println(search(arr,13,0));    
        System.out.println(searchi(arr,4,0));    

        // searchAllIndex(arr,4,0);    
        // System.out.println(list);    

        System.out.println(searchAllIndexList(arr,4,0,new ArrayList<>()));
        System.out.println(searchAllIndexList2(arr,4,0));
    }

    private static boolean search(int[] arr, int taget, int index) {
       
        if(index>arr.length-1){
            return false;
        }

        else if(arr[index]==taget){
            return true;
        }

        return search(arr, taget, index+1);
    
    }

    private static int searchi(int[] arr, int taget, int index) {
       
        if(index>arr.length-1){
            return -1;
        }

       if(arr[index]==taget){
            return index;
        }
      
        return searchi(arr, taget, index+1);
       
    
    }
     static ArrayList<Integer> list=new ArrayList<>();
    private static void searchAllIndex(int[] arr, int taget, int index) {
       
        if(index>arr.length-1){
            return;
        }

       if(arr[index]==taget){
           list.add(index);
        }
      
         searchAllIndex(arr, taget, index+1);
       
    
    }
//GOOD APPROCH
    private static ArrayList<Integer> searchAllIndexList(int[] arr, int taget, int index,ArrayList<Integer> list2) {
       
        if(index>arr.length-1){
            return list2;
        }

       if(arr[index]==taget){
           list2.add(index);
        }
      
       return searchAllIndexList(arr, taget, index+1,list2);
       
    
    }

// NOT TAKING THE LIST AS ARRGUMENT NOT GOOD APPROCH
    private static ArrayList<Integer> searchAllIndexList2(int[] arr, int taget, int index) {
        ArrayList<Integer> list2=new ArrayList<>();
        if(index>arr.length-1){//==
            return list2;
        }

       if(arr[index]==taget){
           list2.add(index);
        }
      
        ArrayList<Integer>anstillnow= searchAllIndexList2(arr, taget, index+1);
        anstillnow.addAll(list2);
        return anstillnow;
    
        // list2.addAll(anstillnow);
        // return list2;

    }


}
