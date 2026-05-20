class NumberLength{
	public static void main(String args[]){
		int num = 3456756;
		int count = 0;

	while(num>0){
		num/=10;	
	        count++;
	}
	System.out.print("Length of Number is: "+count);
}
}