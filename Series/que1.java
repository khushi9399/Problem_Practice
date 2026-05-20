// Program to find out compound interest if principal is greater than 
// or equals to 500 otherwise find out simple interest


import java.util.Scanner;

class Test{
    public static void main (String... arg){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter rate of Interest . :");
        double rate  =sc.nextInt();
        System.out.println("Enter time . :");
        double  time  =sc.nextInt();
        System.out.println("Enter principle . :");
        double  principle  =sc.nextInt();
        
        double A_totalamount = principle * Math.pow((1 + rate/100), time );
        double CI= A_totalamount-principle;
        double SI = (principle*rate*time)/100;

        if(principle >=500){
        System.out.println(" compound interest : "+CI);

        }
        else{
        System.out.println(" Simple interest : "+SI);
        

        }
         

    
    }
}