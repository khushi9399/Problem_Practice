// WAP to convert First character of every word into upper case.

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        String result = "";
        for(int i = 0; i<=str.length()-1; i++){
            char ch = str.charAt(i);

            if(i == 0 || str.charAt(i - 1) == ' ')
                if(ch >= 'a' && ch<='z'){
                    ch = (char)(ch-32);
            }
            result += ch;
        }
        System.out.println(result);
    }
}