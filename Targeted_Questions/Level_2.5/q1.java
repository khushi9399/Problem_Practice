import java.util.Scanner;

class Main{

    public static int sumOfLeaders(int arr[],int size){
        if(size == 0)
            return -1;

        int sum = 0;

        for(int i = 0; i<=arr.length-1; i++){
            boolean isLeader = true;
            for(int j = i+1; j<=arr.length-1; i++){
                if(arr[i] < arr[j]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader){
                sum += arr[i];
            }
        }
        return sum;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size of element");
    int size = sc.nextInt();

    int arr[] = new int[size];

    int sumOfLeaders[] = sumOfLeaders(arr,size);

    System.out.prinln(sumOfLeaders.sum); 

    }
}