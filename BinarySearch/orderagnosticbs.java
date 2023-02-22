package BinarySearch;
public class orderagnosticbs {
    public static void main(String[] args) {
        // int [] arr={-12,-4,-2,-1,0,1,2,4,5,7,8,9};
        int [] arr={34,31,10,8,7,5,3,1,0,-2,-12,-112,-277};
        int target=-112;
        int ans=Bs(arr,target);
        System.out.println("Ans Index= "+ans);
        //System.out.println("element search"+arr[mid1]);
    }

    static int Bs(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;

        while(start<=end){

        if(arr[start]<=arr[end]){//ascending
             int mid=(start+end)/2;
            //  System.out.println(mid);
             if(target > arr[mid]){
                 start=mid+1;
             }
             else if(target < arr[mid]){
                 end=mid-1;
             }
             else{
                 return mid;
             }
        }

        if(arr[start]>=arr[end]){//descending
             int mid=(start+end)/2;
            //  System.out.println(mid);
             if(target > arr[mid]){
                 end=mid-1;
             }
             else if(target < arr[mid]){
                start=mid+1;
             }
             else{
                 return mid;
             }
        }

        } 
        return -1;
   }



}
