class FindDuplicate{
	public static void main(String args[]){
	     int arr[] = {6,8,4,6,9,8};
	
	for(int i=0; i<arr.length; i++){
		for(int j = i+1; j<arr.length;j++){
			if(arr[i]==arr[j]){
				System.out.println("Duplicate: "+arr[i]);
				break;
			}
				
		}
	}
	
}
}