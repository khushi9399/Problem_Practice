class CheckSortedArray{
	public static void main(String args[]){
	int arr[] = {3,5,6,7,8};
	boolean check = true;

	for(int i = 0; i<arr.length-1 ; i++){
		if(arr[i] > arr[i+1])
			check = false;
	       
}
	System.out.print(check);
}
}



