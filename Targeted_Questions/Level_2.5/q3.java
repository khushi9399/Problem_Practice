/*3.
Write a Java program to concatenate two given arrays. 
Define a method concatenateArrays that takes two integer arrays as arguments and returns a new array 
containing all elements of the first array followed by all elements of the second array.
Code constraints :
The input arrays can be of any length, including empty.
Sample test cases :
Input 1 :
int[] array1 = {1, 2, 3};
int[] array2 = {4, 5, 6};
Output 1 :
1 2 3 4 5 6 
*/

import java.util.Scanner;
class Main{

    public static int[] concatenateArrays(int arr1[], int arr2[]){
        int n = 0;
        int concatenateArray[] = new int[arr1.length + arr2.length];

        for(int i = 0; i<=arr1.length-1;i++){
            concatenateArray[n++] = arr1[i];
        }

        for(int j = 0; j<=arr2.length-1; j++){
            concatenateArray[n++] = arr2[j];
        }

        return concatenateArray;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array : ");
        int size1 = sc.nextInt();

        int arr1[] = new int[size1];

        System.out.println("Enter elements in 1st array : ");
        for(int i = 0; i<=size1-1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array : ");
        int size2 = sc.nextInt();

        int arr2[] = new int[size2];

        System.out.println("Enter elements in 2nd array : ");
        for(int i = 0; i<=size2-1; i++){
            arr2[i] = sc.nextInt();
        }

        int concatenateArray[] = concatenateArrays(arr1,arr2);

        System.out.println("Concatenate Array is : ");
        
        //By for-Loop
        for(int i = 0; i<concatenateArray.length; i++){
            System.out.print(concatenateArray[i]+ " ");
        }

        //By for-each Loop---------but it occurs ArrayIndexOutOfBoundsException

        // for(int num : concatenateArray){
        //     System.out.print(concatenateArray[num]+ " ");
        // }
    }
}