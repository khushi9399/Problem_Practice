//        * 
//       * *
//      * _ *
//     * _ _ *
//    * _ _ _ *
//   * _ _ _ _ *
//  * _ _ _ _ _ *
// * * * * * * * *

class Test{
    public static void main (String[]args){
        int n = 8;
        int j =0;
        int k = 0;
        int i=0;
        for( i =1; i<=n; i++){
            for ( j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (  k=1; k<=i; k++){
                if(k==1||i==k||i==8){
                System.out.print("* ");
                }
                else {
                System.out.print("_"+" ");
                }
                }
        System.out.println();
            }
        }
    }