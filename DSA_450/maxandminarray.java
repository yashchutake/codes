package DSA_450;
import java.util.*;
public class maxandminarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no  of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            int c=i+1;
            System.out.println("Enter Input no-"+c);
            arr[i] = sc.nextInt();

        }
       

        List<Integer> list=new ArrayList<>();
        for (Integer ele: arr) {
            list.add(ele);
        }   

        System.out.println(list);

        System.out.println("Max in list "+Collections.max(list));
        System.out.println("Min in list "+Collections.min(list));

    
    }    
}
