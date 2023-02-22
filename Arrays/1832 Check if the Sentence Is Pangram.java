class Solution {
    public boolean checkIfPangram(String sentence) {
        String y=sentence;
        
          for(char c='a';c<='z';c++)
          {
            if(y.contains(String.valueOf(c))){
              return true;
            }
   
            // System.out.println(c);
            // System.out.println(String.valueOf('y'));
            // // String.valueOf(y);
          }
          return false;
            
            
        // int n=sentence.length();
        // char [] ans=sentence.toCharArray();   
        // if(n>=26){
        //     return true;
        // }
        // else{
        //     return false;
        // }
    }
}