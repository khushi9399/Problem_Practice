/*Valid Password or Not

The HR committee of Sunrise Basket Company decided to enforce the following rules when an employee creates/changes his/her password.

1.	Password should be less than 15 and more than 8 characters in length.
2.	Password should contain at least one upper case and one lower case alphabet.   
3.	Password should contain at least one number.
4.	Password should contain at least one special character.
5.	Password should not contain a space.
*/


//Incomplete
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password : ");
        String password = sc.nextLine();

        if((password.length()<15) && (password.length()>8)){
             for(int i = 0; i<=password.length()-1; i++){
                if((password.charAt(i)>='A') && (password.charAt(i)<='Z')){
                    System.out.println("Password must contain at least 1 upper case");
                    if(!(password.charAt(i)>='a') && (password.charAt(i)<='z')){
                        System.out.println("Password must contain at least 1 lower case");
                    }
                }
        }
            // System.out.println("Valid");
        }
        else{
            System.out.println("Password must between 8 to 15 charater");
        }
       
    }
}
