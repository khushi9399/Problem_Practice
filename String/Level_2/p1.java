/*
Character Frequency
Write a program to find the frequency of each character in a string.
Example Input: hello
Example Output: {h=1, e=1, l=2, o=1}
*/

// import java.util.Scanner;
// class Test{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a String : ");
//         String str = sc.nextLine();

//         int count ;
//         for(int i = 0; i <= str.length()-1; i++){
//             count = 0;
//             char ch1= str.charAt(i);
//             for(int j = 0; j<=str.length()-1; j++){
//                 char ch2=str.charAt(j);
//                 if(ch1==ch2){

//                     count++;
//                 }
//             }
//             if(str.indexOf(ch1) == i)
//             System.out.println(ch1+" : "+ count);
//         }
        
//     }
// }

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        int count;
        for(int i = 0; i<=str.length()-1; i++){
            count = 0;
            for(int j = 0; j<=str.length()-1; j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            // if(str.indexOf(str.charAt(i)) == i)
            System.out.println(str.charAt(i)+ " " +count);
        }
    }
}
