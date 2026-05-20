// WAP to read a string from user,Read a character from user and count how many times that character occurred in that string.

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);

        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Character occurs " + count + " times");
    }
}