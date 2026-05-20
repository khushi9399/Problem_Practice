// 6 5 4 3 2 1
// 6 5 4 3 2
// 6 5 4 3
// 6 5 4
// 6 5
// 6

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = n; j>=i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    //  for(int i = 1; i<=6; i++){
    //         for(int j = 1; j<=n-i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    }
    }
    
