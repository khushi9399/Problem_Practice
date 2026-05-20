//2. WAP to read array length and elements from user and display sum of all the elements of the array.
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter " +size+ " elements");

        for(int i = 0; i <= arr.length-1; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i <=  arr.length-1; i++){
            sum += arr[i];
        }
        System.out.println("Sum is :" +sum+ " ");

        System.out.println("For-Each loop-");
        sum = 0;
        for(int num : arr){
            sum += num;
        }
        System.out.println("Sum is :" +sum);
        
        System.out.println("While loop-");
        int j = 0;
        sum = 0;
        while(arr.length>j){
            sum += arr[j];
            j++;
        }
        System.out.println("Sum is :" +sum);

        System.out.println("Do-While loop-");
        j = 0;
        sum = 0;
        do{
            sum += arr[j];
            j++;
        }
        while(arr.length>j);
        System.out.println("Sum is :"+sum);
    }
}


