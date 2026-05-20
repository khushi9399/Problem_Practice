// * * * * * 6
// * * * * 6 5 6
// * * * 6 5 4 5 6
// * * 6 5 4 3 4 5 6
// * 6 5 4 3 2 3 4 5 6
// 6 5 4 3 2 1 2 3 4 5 6

//incomplete
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = n; j>=; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}