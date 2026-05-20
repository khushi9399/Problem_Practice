// Prime or not using Method

// import java.util.Scanner;
// class Test{
//     public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a number :");
//     int num = sc.nextInt();
//     int count = 0;

//     for(int i = 1; i<=num; i++){
//         if(num % i == 0)
//            count++;
//     }
//         if(count == 2){
//             System.out.println(num+ " is Prime");
//         }
//         else{
//             System.out.println(num+ "is not prime");
//         }
//     }
// }


import java.util.Scanner;

 class PrimeCheck {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) { 
            if (n % i == 0) {
                return false; // divisible by i → not prime
            }
        }
        return true; // prime number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is not  Prime num");
        }
        
        // sc.close();
    }
}


