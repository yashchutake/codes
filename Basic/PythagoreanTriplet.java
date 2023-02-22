import java.util.*;
//import java.sql.Array;


public class PythagoreanTriplet {


    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a no to check Patagorean Triplet or Not");
        int [] arr= new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i]=ip.nextInt();
        }
   
       boolean res=isTriplet(arr,arr.length);

       if(res){
        System.out.println("No is a Patagorean Triplet");
       }
       else{
        System.out.println("No NOT a Patagorean Triplet");
       }

      //  System.out.println(Arrays.toString(arr));
    }

    static boolean isTriplet(int[] arr, int length) {
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                for(int k=j+1;k<length;k++){
                    int x=arr[i]*arr[i];
                    int y=arr[j]*arr[j];
                    int z=arr[k]*arr[k];
                    if(x==y+z || y==x+z || z==y+x ){
                        return true;
                    }
                }
            }
        }
        return false;
    }

   
}
