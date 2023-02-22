import java.lang.reflect.Array;
import java.util.Arrays;

import BinarySearch.leilingOfTargetNo;

public class sortedTwoDArraySearch {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 12, 16}
    };
    System.out.println(Arrays.toString(search(arr, 16)));
    }
    //search in rows that provided in between cals provided
    static int[] binarysearch(int[][] mat,int row,int cStart,int cEnd,int target){
        while(cStart <= cEnd){
            int mid=cStart + (cEnd-cStart)/2;
            if(mat[row][mid]==target){
                return new int[] {row,mid};
            }
            if(mat[row][mid]< target){
                cStart=mid+1;
            }
            else{
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] mat, int target){
        int row=mat.length;
        int col=mat[0].length;//be caution ,matrix may be empty
        if(col==0){
            return new int[] {-1,-1};
        }
        if(row ==1){
            return binarysearch(mat, 0, 0, col-1, target);
        }

        int rStart=0;
        int rEnd=row-1;
        int cMid=col/2;

        ///run the loop till 2 rows are remaining
        while(rStart< (rEnd-1)){// while this is true it will have more than 2 rows
            int mid=rStart+(rEnd-rStart)/2;
            if(mat[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(mat[mid][cMid] < target){
                rStart=mid;//ignore the above rows
            }
            else{
                rEnd=mid;//ignore the below rows
            }
        }

        //now we have two rows 
        //check whether the target in the col of two rows

        if(mat[rStart][cMid]==target){
            return new int[] {rStart,cMid};
        }
        
        if(mat[rStart+1][cMid]==target){
            return new int[] {rStart+1,cMid};
        }

        //in 1 st half

        if(target<=mat[rStart][cMid-1]){
            return binarysearch(mat, rStart, 0, cMid-1, target);
        }

        //in 2nd half

        if(target>=mat[rStart][cMid+1] && target<mat[rStart][col-1]){
            return binarysearch(mat, rStart, cMid+1, col-1, target);
        }


        //in 3 rd half

        if(target<=mat[rStart+1][cMid-1]){
            return binarysearch(mat, rStart+1, 0, cMid-1, target);
        }

        else{
            return binarysearch(mat, rStart+1, cMid+1, col-1, target); 
        }

    }

}
