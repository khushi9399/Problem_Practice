/*3.Write a Java program to concatenate two given arrays. 
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
class Test{

    public static int[] concatenateArrays(int arr1[],int arr2[]){
            int concatenateArray[] = new int[arr1.length + arr2.length];
            int n =0;                                  //For maintaining index
            for(int i = 0; i<=arr1.length-1;i++){
                concatenateArray[n++] = arr1[i];
            }

            for(int j = 0;j<=arr2.length-1; j++){
                concatenateArray[n++] = arr2[j];
            }
        return concatenateArray;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of an array 1 : ");
        int size1 = sc.nextInt();

        int arr1[] = new int[size1];
        System.out.println("Enter "+size1+ " values in array 1");
        for(int i = 0; i<=arr1.length-1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of an array 2 : ");
        int size2 = sc.nextInt();

        int arr2[] = new int[size2];
        System.out.println("Enter "+size2+ " values");
        for(int i = 0; i<=arr2.length-1; i++){
            arr2[i] = sc.nextInt();
        }

        int[] concatenateArray = concatenateArrays(arr1,arr2);
        System.out.println("Concatenate Array is : ");
        for(int i = 0; i<=concatenateArray.length-1; i++){
            System.out.print(concatenateArray[i]+" ");
        }

    }
}
