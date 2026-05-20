// remove()-->remove particular element 
import java.util.ArrayList;
class Test{
    public static void main(String args[]){
        ArrayList <Integer> al = new ArrayList <Integer>();
        al.add(234);
        al.add(44);
        al.add(267);
        al.add(678);
        al.add(34);
        System.out.println(al);
        al.remove(2);    //This removes the element of index 2
        System.out.println(al);
        al.remove(new Integer(34));   // This removes the element 34 

        System.out.println(al);

    }
}