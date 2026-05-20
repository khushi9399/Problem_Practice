import java.util.*;
import java.util.stream.*;
class Test{
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(3,56,34,7,9);

        long count = list.stream().count();

        System.out.println("Total number of elements is : " +count);
    }
}