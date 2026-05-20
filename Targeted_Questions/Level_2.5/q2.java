/*
Implement the given function,
int SumUniqueElements(int* arr, int length);
The function accepts an Integer array ‘arr of size ‘length’ as input. Implement the function such that it returns the sum of unique (non-duplicate) elements in the array.
*/

import java.util.Scanner;
class Main{

    public static int sumUniqueElement(int arr[] ,int size){
        if(size == 0)
            return -1;

        int sum = 0;

        for(int i = 0; i<arr.length;i++){
            int count = 0; 
        for(int j = 0;j<arr.length;j++){
            if (arr[i] == arr[j]){
                  count++;
            }
        }
            if(count == 1){
                sum += arr[i];
            }
        }
    return sum;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Values : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(sumUniqueElement(arr, size));
      
    }
}