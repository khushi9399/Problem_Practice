// digit count--that how many times the digit occured
// WAP to to count the occurance of all element in array
class Test{
    public static void main(String args[]){
        int arr[] = {2,3,3,2,4,5,5,6,6,6};
        boolean flag[] = new boolean[arr.length];    //flag[]-->This is used to avoid counting same number again.

        for(int i=0; i<arr.length; i++){
            int count = 1;
            if(flag[i])                      //Skip Already Counted Elements
              continue;
            for(int j=i+1; j<arr.length; j++){
               if(arr[i] == arr[j]){
                count++;
                flag[j] = true;             //This marks that element as already counted.
               }
            }  
            System.out.println("Element "+arr[i]+" Found "+count+" times");
        }
    }
}







