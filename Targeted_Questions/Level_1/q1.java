//1. WAP to read array length and elements from user and display them using for loop, while loop, for each loop and do-while loop.

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array :");
        int size = sc.nextInt();
        int elements[] = new int[size];

        System.out.print("Enter " +size+ " elements :");
        for(int i = 0; i< size; i++){
            elements[i] = sc.nextInt();
        }

        //display using for loop
        for(int i = 0; i<=elements.length-1; i++){
            System.out.println("Elements are :"+elements[i]+ " ");        
        }

        System.out.println("for-each loop---");
        //for-each loop
        for(int num : elements){
            System.out.print(num+ " ");
        }

        System.out.println("While loop---");
        //while-loop
        int j = 0;
        while(j<elements.length){
            System.out.print(elements[j]+ " ");
            j++;
        }

        System.out.println("Do-While loop---");

        j = 0;
        do{
            System.out.println(elements[j]+ " ");
            j++;
        }
        while(j < elements.length);
    }
}