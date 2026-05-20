// Find the Largest Element in Array

class LargestElement{
    public static void main(String args[]){
        int arr[]={4,2,1,8};
        int largest = arr[0];    //assume first element as largest
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest)    //if arr[i] is largest then update that number as largest
               largest = arr[i];
        }
        System.out.println("Largest number is "+largest);
    }
}

// ----------------------------------------------------
// Input: arr[] = [12, 35, 1, 10, 34, 1]
// Output: 34
// Explanation: The largest element of the array is 35 and the second largest element is 34.

// class LargestElement{
//     public static void main(String args[]){
//         int arr[] = {12,35,1,10,34,1};
//         int largest = arr[0];

//         for(int i = 1; i < arr.length ; i++){
//             if(arr[i] > largest)
//                largest = arr[i];
//         }
//         System.out.println("Largest element is "+largest);
//     }
// }
