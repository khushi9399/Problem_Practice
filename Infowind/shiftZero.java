class ShiftZero{
    public static void main(String args[]){
        int arr[] = {2,1,0,6,0,0,4};
        int j = 0;

        for(int i = 0; i<arr.length;i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        } 
        while(j<arr.length){
            arr[j] = 0;
            j++;
        }
         for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
         }
        
    }
}