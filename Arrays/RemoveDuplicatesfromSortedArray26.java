public class RemoveDuplicatesfromSortedArray26 {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,5};
        int count = 0;
        // Loop for all the elements in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is equal to the next element, we skip
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            // We will update the array in place
            nums[count] = nums[i];
            count++;
        }
        // return count;
        System.out.println(count);
    }
}
