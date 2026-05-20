//2.Write a Java program to reverse a given array. 
// Define a method reverseArray that takes an integer array as an argument and returns a new array with the elements in reverse order.

import java.util.Scanner;
class Test{

    public static int[] reverseArray(int arr[]){
        int newArray[] = new int[arr.length];
        int j = 0;
        for(int i = arr.length-1; i>=0;i--){
            newArray[j] = arr[i];
            j++;
        }
        return newArray;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter "+size+ " values");
        for(int i = 0; i<=arr.length-1; i++){
            arr[i] = sc.nextInt();
        }
    
        int reversed[] = reverseArray(arr);

        System.out.print("Reverse array is : ");
        for(int i = 0; i <reversed.length; i++){
            System.out.print(reversed[i]+ " ");
        }
        
    }
}








