// 6 5 4 3 2 1
// 5 4 3 2 1
// 4 3 2 1
// 3 2 1
// 2 1
// 1

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = n-i+1; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}