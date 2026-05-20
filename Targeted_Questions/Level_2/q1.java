/* 1.
Write a Java program to find the maximum value in a given array. Define a method findMax that takes an integer array as an argument and returns the maximum value.
Code constraints :
The input array should have at least one element.
Sample test cases :
Input 1 :
5
10
20
30
40
50
Output 1 :
The maximum value in n the array is: 50
*/

import java.util.Scanner;

class Max{
    public static int findMax(int arr[]){
    int max = Integer.MIN_VALUE;

      for(int j = 0; j <= arr.length-1; j++){
        if(arr[j] > max){
            max = arr[j];
        }
      }
      return max;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array :");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter elements");
        for(int i = 0; i <= arr.length-1; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Maximum element is :" +Max.findMax(arr));
    }
}
