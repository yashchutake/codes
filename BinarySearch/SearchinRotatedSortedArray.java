// Java program to find number of
// rotations in a sorted and rotated
// array.
package BinarySearch;
import java.io.*;
import java.lang.*;
import java.util.*;

class SearchinRotatedSortedArray {
	// Returns count of rotations for an
	// array which is first sorted in
	// ascending order, then rotated
	// static int countRotations(int arr[], int n)
	// {
	// 	// We basically find index of minimum
	// 	// element
	// 	int min = arr[0], min_index = 0;
	// 	for (int i = 0; i < n; i++) {
	// 		if (min > arr[i]) {
	// 			min = arr[i];
	// 			min_index = i;
	// 		}
	// 	}
	// 	return min_index;
	// }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

	// Driver program to test above functions
	public static void main(String[] args)
	{
		int arr[] = {3,4,5,1,2};
		//int n = arr.length;
        int pivote=findPivot(arr);
        int count=pivote+1;
		System.out.println(pivote);
	}
}

// This code is contributed by Adutya Kumar(adityakumar129)

