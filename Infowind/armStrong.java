//Armstrong--> 153 = 1^3 + 5^3 + 3^3 = 153 (sum of their digits cube must be equal to given number)
class ArmStrong{
	public static void main(String args[]){
		int num = 153;
		int temp = num;
		int sum = 0;

	while(num>0){
		int digit = num % 10;
		sum = sum + digit*digit*digit;
		num = num/10;
}
	if(sum == temp)
		System.out.println("Armstrong");
	else
		System.out.println("Not Armstrong");

}
}
