// find an element in array using for each loop

// class Test{
//     public static void main(String args[]){
//         int arr[] = {1,6,23,77,4};

//         for(int i : arr){
//           if(i == 77){
//             System.out.println("Found");
//           }
//         }
//     }
// }


// ----> Take input from user
import java.util.Scanner; 
class Test{
  public static void main(String args[]){
    int arr[] = {11,34,56,74,80};
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a value");
    int value = sc.nextInt();

    for(int i : arr){
      if(i == value)
         System.out.println("found");
    }
  }
}