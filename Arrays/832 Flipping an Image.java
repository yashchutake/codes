class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int l=image.length;
        int m=l;
        int n=l;
        for(int i=0;i<m;i++){
            int start=0;
            int end=n-1;           
		// Till start < end, swap the element
		// at start and end index
            while(start<end){
                //swap the elements
                int temp=image[i][start];
                image [i][start]=  image [i][end];
                image [i][end]=temp;
                // Increment start and decrement
                // end for next pair of swapping
                start++;
                end--;
            }
                    // if (start == end) image [i][start] = image[i][start] == 1 ? 0 : 1;
        }
      

        for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
                if(image [i][j]==0){
                   image [i][j]=1; 
                }
                else{
                image [i][j]=0; 
                }
           

         }
        }
        
        
        
        return image;
    }
}