//Methods
//Without type safe

import java.util.ArrayList;
class Test{
    public static void main(String args[]){
        ArrayList al = new ArrayList();     //it is not type safe so this gives us warning during compile time but execution will br sucessful
        al.add(2);
        al.add(34);
        al.add(45);
        System.out.println(al);
    }
}