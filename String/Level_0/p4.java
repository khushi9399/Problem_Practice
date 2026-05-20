// WAP to read a String from user and count how many spaces are available in that String.

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int spaceCount = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        System.out.println("Number of spaces: " + spaceCount);
    }
}