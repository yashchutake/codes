package DSA_450;

public class MinNumJupLast {
    public static void main(String[] args) {
        int arr[]={1};
        int min = minJumps(arr);
        System.out.println(min);
    }

    static int minJumps(int[] arr){
        // your code here
        int count=0,current=0,max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,i+arr[i]);
            System.out.println("max="+max);
            if(current >=arr.length-1){
                System.out.println("cureent="+current);
                break;}
            else if(max<=i){
                System.out.println("max="+max);
                return -1;}
            else if (i==current){
                System.out.println("current="+current);
                current=max;count++;}
            
        }
        return count;
    }

}
