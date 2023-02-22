package BinarySearch;
public class binarysearch {
    public static void main(String[] args) {
        int[] arr = { -12, -4, -2, -1, 0, 1, 2, 4, 5, 7, 8, 9 };
        int target = -4;
        int ans = Bs(arr, target);
        System.out.println(ans);
    }

    static int Bs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;// effective for large no for INT
            // int mid=(start+end)/2;
            // System.out.println(mid);
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                // ans found
                return mid;
            }
            // return -1;
        }
        return -1;
    }
}
