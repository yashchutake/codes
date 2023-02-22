public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        int [] arr={3,1,5,4,2,1};
        int ans=findDuplicate(arr);
        System.out.println(ans);

    }

    public static int findDuplicate(int[] arr) {
        int i=0;

        while(i<arr.length){
            if(arr[i] != i+1){
                int correctpos=arr[i]-1;
                if(arr[correctpos] != arr[i]){
                    swap(arr,correctpos,i);
    
                }
                else{
                    return arr[i];
                    //i++;//move forward
                }
            }

            else{
                i++;
            }
        
        }
        return -1;
    }
    
    static void swap(int[] arr, int correctpos, int i) {
        int temp=arr[correctpos];
        arr[correctpos]=arr[i];
        arr[i]=temp;
}
}
