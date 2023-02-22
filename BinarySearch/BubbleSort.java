import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={14,544,-037,42,0,1};
        buble(arr);
        System.out.println(Arrays.toString(arr));
        // System.out.println();
    }
    static void buble(int[] arr){
        boolean swap;
        //run for n-1 times
        for(int i=0;i<arr.length;i++){
            swap=false;
            //for each step max items will come at last respective index
            for(int j=1;j<arr.length-i;j++){
                if(arr[j] < arr[j-1] ){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if(swap != true){
                break;
            }

        }
        // System.out.println(Arrays.toString(arr));
    }
}
