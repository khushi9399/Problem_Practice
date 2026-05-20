class MissingNumber{
	public static void main(String args[]){
	int arr[] = {1,2,3,4,5,7};
	int num = 7;

	int total = num*(num+1)/2;
	int sum = 0;
	for(int i : arr){
		sum += i;
	}
	System.out.print(total-sum);
}
}



