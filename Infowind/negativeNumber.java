class NegativeNumber{
	public static void main(String args[]){
		int arr[] = {2,5,-2,-4,1};

		for(int i=0; i<arr.length; i++){
			if(arr[i] < 0)
				System.out.println(arr[i] + " ");
		}
	}
}