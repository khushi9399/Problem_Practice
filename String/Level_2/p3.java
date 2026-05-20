/*
Create a class named Main and create two variables named, venueName and city of type string.
Write a main method to get the venue details in the string separated by a comma. Use String.split() function to display the details.
Input format :
The first line consists of a String that represents the venueName and city.
Output format :
The output should display the venue details.
*/

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        String parts[] = str.split(",");

        System.out.println("Venue details : ");
        System.out.println("Venue name : "+parts[0]);
        System.out.println("City name :"+parts[1]);
    }
}
