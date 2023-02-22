package DSA_450;

public class kandanesAlo {
    public static void main(String[] args) {
        int arr[]={4,40,-1,86,1,443};
        System.out.println(maxsumarr(arr));
    }

    private static int maxsumarr(int[] arr) {
        int sum=0;
        int sum_i=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
        if(sum_i < sum){
            sum_i=sum;
        }
        if(sum<0){
            sum=0;
        }


        }
        return sum_i;


    }
}
