// Write a program to check string contains special characters($, @, #) or not

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        boolean found = false;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == '$' || ch == '@' || ch == '#') {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("String contains special character");
        } else {
            System.out.println("No special character found");
        }
    }
}