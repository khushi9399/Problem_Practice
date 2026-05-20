// get the element using loop
import java.util.ArrayList;
class Test{
    public static void main(String args[]){
        ArrayList <Integer> al = new ArrayList <Integer>();
        al.add(990);
        al.add(456);
        al.add(50);
        al.add(879);
        al.add(123);

        // for(Integer element:al){           //Using for-each loop
        //     System.out.println(element);
        // }

        for (int i = 0; i<al.size(); i++){    //Using for loop---> we use al.get(i)
            System.out.println(al.get(i));
        }
    }
}