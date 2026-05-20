import java.util.*;
import java.util.stream.*;
class Test{
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(2,5,1,68,400);

        int max = list.stream().max(Integer::compare).get();
        
        System.out.println("Maximum element is : "+max);
    }
}