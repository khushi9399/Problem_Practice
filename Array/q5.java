// Sum of array

class Test{
    public static void main(String args[]){
        int arr[] = {3,4,6,2};
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}