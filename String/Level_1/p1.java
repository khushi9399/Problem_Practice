// Palindrome Check Write a program to check if a given string is a palindrome (reads the same backward as forward).

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        String rev = "";

        for(int i = str.length()-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev)) {
            System.out.println("Yes, it's a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}