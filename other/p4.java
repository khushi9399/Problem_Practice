class Test{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j<arr.length; j++){               //also starts with j=1 so  isme 3,3 bhi aa jayenge
                if(arr[i] + arr[j] == 6){
                    System.out.println(arr[i]+ " " +arr[j]);
                }
            }
        }
    }
}