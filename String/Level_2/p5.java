// WAP to read a string from user and convert all the vovels into upper case.

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        String result = "";
        for(int i = 0; i<=str.length()-1; i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || 
               ch == 'i' || ch == 'o' || ch == 'u'){
               ch = (char)(ch-32);
            }
            result += ch;
        }
        System.out.println(result);
    }
}