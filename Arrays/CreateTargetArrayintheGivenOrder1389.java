import java.util.*;
public class CreateTargetArrayintheGivenOrder {
    public static void main(String[] args) {
        int [] nums={0,1,2,3,4};
        int [] index={0,1,2,2,1};
        createTargetArray(nums,index);
        // Scanner ip=new Scanner(System.in);
        // int n=ip.nextInt();
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
     List<Integer> list=new ArrayList<>();
     for(int i=0;i<nums.length;i++){
         list.add(index[i],nums[i]);
     }
     //System.out.println(list);
     int [] ans=new int[list.size()];

     for(int i=0;i<list.size();i++){
       ans[i]=list.get(i);
    }
      return ans;
    }
  
}
