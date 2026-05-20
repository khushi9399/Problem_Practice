import java.util.ArrayList;
class Test{
    public static void main(String args[]){
        ArrayList <Integer> al  = new ArrayList <Integer> ();
        al.add(345);
        al.add(45);
        al.add(95);
        al.add(68);
        al.add(22);
        System.out.println("Total element :"+al.size());
        System.out.println(al);

        al.add(3,800);       //Add element at 3 index
        al.add(4,900);       //Add element at 4 index
        System.out.println("Total element :"+al.size());
        System.out.println(al);

        al.add(9,409);      // This throw an exception--->Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 9, Size: 7 (b'coz its size is 7 and we add element at 9 index so that's why it gives exception)
    }
}