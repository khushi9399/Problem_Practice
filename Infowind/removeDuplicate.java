class RemoveDuplicate{
	public static void main(String args[]){
		int arr[] = {6,2,7,2,6};

	for(int i = 0 ; i<arr.length; i++){
		boolean isDuplicate = false;

	for(int j = 0; j<i; j++){
		if(arr[i] == arr[j]){
		isDuplicate = true;
		break;
	}
	}
        if(!isDuplicate){
		System.out.print(arr[i]+ " ");
}
}
}
}