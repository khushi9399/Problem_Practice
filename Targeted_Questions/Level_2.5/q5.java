//5. WAP to read two 2-D array elements from user and find sum of that two array in third array and display elements of that third array.

// import java.util.Scanner;

// class Test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
           
//            System.out.println("Enter number of rows : ");
//         int rows = sc.nextInt();
//          System.out.println("Enter number of columns : ");
//         int cols = sc.nextInt();

//         int arr1[][] = new int[rows][cols];
//         int arr2[][] = new int[rows][cols];
//         int sum[][] = new int[rows][cols];

//             System.out.println("Enter elements in array 1:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 arr1[i][j] = sc.nextInt();
//             }
//         }

//             System.out.println("Enter elements in array 2:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 arr2[i][j] = sc.nextInt();
//             }
//         }

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 sum[i][j] = arr1[i][j] + arr2[i][j];
//             }
//         }

//         System.out.print("Sum of elements are : ");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print(sum[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }




import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns : ");
        int cols = sc.nextInt();

        int arr1[][] = new int[rows][cols];

        System.out.println("Enter elements in array 1:");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        int arr2[][] = new int[rows][cols];
        
        System.out.println("Enter elements in array 2:");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        int sumArray[][] = new int[rows][cols];

        for(int i = 0; i<rows; i++){
              for(int j = 0; j<cols; j++){
                sumArray[i][j] = arr1[i][j] + arr2[i][j]; 
            }
        }

        System.out.println("Sum of Elements are : ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.println(sumArray[i][j]+ " ");
            }
        }
        System.out.println();
    }
}