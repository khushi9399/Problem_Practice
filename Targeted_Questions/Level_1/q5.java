//5. WAP to read array length and elements from user and reverse that array and display that reversed array.
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter "+size+ " values");
        
        for(int i = 0; i<=arr.length-1; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Reversed Array is :");
        for(int j = arr.length-1; j>=0; j--){
          System.out.print(" " +arr[j]+ " ");
        }

    }
}