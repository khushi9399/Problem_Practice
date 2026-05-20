//contains()--->to find out element is present or not in an ArrayList
import java.util.ArrayList;
class Test{
    public static void main(String args[]){
        ArrayList <String> al = new ArrayList <String>();
        al.add("234");
        al.add("44");
        al.add("267");
        al.add("678");
        al.add("34");
        System.out.println(al.contains("234"));  //True
        System.out.println(al.contains("809"));  //False
    }
}