//Convert list to map
import java.util.*;
import java.util.stream.*;
class Test{
    public static void main(String args[]){
        List<Student> list = Arrays.asList(
            new Student(1,"khushi"),
            new Student(2,"anisha")
        );

        Map<Integer,Student> map = list.stream().collect(Collectors.toMap(x -> x.getId(), x->x));
        System.out.println(map);

    }
}