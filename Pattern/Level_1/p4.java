// 1
// * *
// 1 2 3
// * * * *
// 1 2 3 4 5
// * * * * * *

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if(i%2 == 0){
                    System.out.print("*"+" ");
                }
                else if(i%2 ==1){
                    System.out.print(j+" ");
                    
                }
            }
            System.out.println();
        }
    }
}