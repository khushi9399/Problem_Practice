// Remove all spaces from a given string without using built-in methods. Example Input: I love coding Example Output: Ilovecoding

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        String result = "";

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch != ' ') {
                result = result + ch;
            }
        }

        System.out.println("After removing spaces: " + result);
    }
}