
import java.util.Scanner;
class Armstrong{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number which you want to check");
		int num = sc.nextInt();
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
		System.out.println("Not");
}
}

