// Reverse an Array

class ReverseArray{
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};   
        int left = 0;                 //We solve this by taking two pointer (called two pointer technique) i.e. left and right
        int right = arr.length-1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;          //left++ moves pointer to the next element from the start
            right--;         //right-- moves pointer to the next element from the end

    }
    System.out.print("Reverse Array is:");        //Now print the result
            for(int num : arr){
                System.out.print(" "+num);
            }
        }
}
