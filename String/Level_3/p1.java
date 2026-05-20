// Check if two strings are anagrams using String.

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String 1: ");
        String str1 = sc.nextLine();

        System.out.println("Enter a String 2: ");
        String str2 = sc.nextLine();

        if(str1.length() == str2.length()){
            for(int i = 0; i<=str1.length()-1; i++){
                char ch = str1.charAt(i);
                if(ch >= 65 && ch<=90){
                    ch = (char)(ch+32);
                }
                str1 += ch;
            }
        }
        System.out.println(str1);
    }
}