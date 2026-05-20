// find maximum value in array
class Test{
    public static void main(String args[]){
        int arr[] = {1,45,6,33,5};
        int result = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > result){
                result = arr[i];
            }
        }
        System.out.println(result);
    }
}