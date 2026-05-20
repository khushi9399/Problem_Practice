//4. WAP to read elements in  2-D array and find maximum and minimum element in that array.

import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        System.out.print("Enter elements in arr : " +" ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];
        int min = arr[0][0];

        for(int i = 0; i<rows;i++){
            for(int j = 0; j<cols; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Maximum is : "+max);
        System.out.println("Minimum is : "+min);
    }
}