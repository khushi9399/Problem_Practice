import  java.util.Arrays;
class Test{
  public static void main(String args[]){
    int arr[] = {8,3,1,2};
   
    int maxSum = 0;
    for(int i=0; i<arr.length; i++){
    int currSum = 0;
       for(int j=i; j<arr.length-1; j++){
          int temp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = temp;
       }
       for(int k=0; k<arr.length; k++){
          currSum += arr[k]*k;
       }
       if(currSum > maxSum ){
         maxSum = currSum;
       }
    }
    System.out.print("MaxSum : "+maxSum);
  }
}