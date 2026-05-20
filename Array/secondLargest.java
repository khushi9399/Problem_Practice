class SecondLargest{
    public static void main(String args[]){
        int arr[] = {7,4,11,9};
        int largest = Integer.MIN_VALUE;         // smallest possible value  //Integer.MIN_VALUE = -2147483648(A very very very small number)
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr){
           if(num > largest){          //If num is greater than largest
            secondLargest = largest;   //then hum largest ko 2nd largest me daal denge
            largest = num;             //and num ko largest me daal denge 
           }
           else if(num > secondLargest && num != largest){     //If num is NOT largest but still bigger than secondLargest
                secondLargest = num;
           }
        }
        System.out.println("Largest number is "+largest);
        System.out.println("Second largest number is "+secondLargest);
    }
}