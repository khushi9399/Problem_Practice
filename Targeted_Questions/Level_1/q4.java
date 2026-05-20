//4.WAP to read array length and elements from user and display only even numbers from that array.
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Enter size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter "+size+ " values"); 

         for(int i=0 ; i<=arr.length-1; i++){
            arr[i] = sc.nextInt();
         }

         for(int i = 0; i<=arr.length-1; i++){
            if(arr[i] % 2 == 0){
                System.out.println("Even Values are :"+arr[i]);
            }
         }

    }
}