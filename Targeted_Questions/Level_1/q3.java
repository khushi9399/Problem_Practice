// 3.WAP to read array length and elements from user and display multiplication of all the elements of the array.
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new  Scanner(System.in);
        int multiply = 1;

        System.out.println("Enter Size of an Array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter " +size+ " values");

        for(int i = 0; i<=arr.length-1; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<=arr.length-1; i++){
            multiply = multiply*arr[i];
        }
        System.out.println("Multiplication is: "+multiply);
    }
}