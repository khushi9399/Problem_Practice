// WAP to read a string from user and convert all the vowels of that string into upper case without predefined method , and display that characters

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        String result = "";

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                ch = (char)(ch - 32); // convert to uppercase
            }

            result = result + ch;
        }

        System.out.println("Updated string: " + result);
    }
}