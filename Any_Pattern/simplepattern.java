package Any_Pattern;

import java.util.regex.Pattern;

public class simplepattern {
    public static void main(String[] args) {
        pattern8(5);
    }

    static void pattern8(int n){
        for(int row=1;row<=n;row++){
        //    int c= row>n ? 2*n-row :row;
            //int spaces=n-row;
            int c=2*row -1;
            for(int i=n;i>=row;i--){
                System.out.print(" ");
                } 

            for(int col=1;col<=c;col++){
            System.out.print("*");
            }  

            System.out.println();
        }
    }


    static void pattern7(int n){
        for(int row=n;row>=1;row--){
        //    int c= row>n ? 2*n-row :row;
            int spaces=n-row;
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
                } 

            for(int col=1;col<=row;col++){
            System.out.print("*");
            }   
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int row=1;row<=n;row++){
        //    int c= row>n ? 2*n-row :row;
            int spaces=n-row;
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
                } 

            for(int col=1;col<=row;col++){
            System.out.print("*");
            }   
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int row=1;row<=2*n-1;row++){
            int c= row>n ? 2*n-row :row;
            for(int col=1;col<=c;col++){
            System.out.print("*");
            }   
            System.out.println();
        }
    }

    static void pattern31(int n){
        int OrginalN=n;
        n=2*n-2;
        for (int row=0;row<=n;row++){
            for (int col=0;col<=n;col++){
                int indexval=OrginalN-Math.min(Math.min(row,col), Math.min(n-col,n-row));//findding the min distance among left right up down
                System.out.print(indexval+" ");
            }
            System.out.println();
        }

    }

    static void pattern17(int n){
        for(int row=1;row<=2*n-1;row++){
            //int totalspaces=n-row;
            int c=row > n ? 2*n-row :row;
           
            for(int i=1;i<=n-c;i++){
                System.out.print("  ");
                }

            for(int col=c;col>=1;col--){
            System.out.print(col+" ");
            }

            for(int col=2;col<=c;col++){
                System.out.print(col+" ");
            } 
            
            System.out.println();

        }
    }

    static void pattern30(int n){
        for(int row=1;row<=n;row++){
            int totalspaces=n-row;
            
            for(int i=1;i<=totalspaces;i++){
                System.out.print("  ");
                }

            for(int col=row;col>=1;col--){
            System.out.print(col+" ");
            }

            for(int col=2;col<=row;col++){
                System.out.print(col+" ");
            } 
            
            System.out.println();

        }
    }






    static void pattern28(int n){
        for(int row=1;row<=2*n-1;row++){
            int tcol=row > n ? 2*n-row :row;
            int nospace=n-tcol;

            for(int col=1;col<=nospace;col++){ 
                System.out.print(" ");
                } 

            for(int col=1;col<=tcol;col++){
            System.out.print("* ");
            }   
            System.out.println();
        }
    }

    static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
            System.out.print("* ");
            }   
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
            System.out.print("* ");
            }   
            System.out.println();
        }
    }


    static void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col=n;col>=row;col--){//or n+1-r
            System.out.print("* ");
            }   
            System.out.println();
        }
    }

    
    static void pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
            System.out.print(col+" ");
            }   
            System.out.println();
        }
    }

}
