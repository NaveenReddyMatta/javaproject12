import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class person {

    private int id;
    private String name;

    public person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ConverListToMap {
    public static void main(String[]args){
        List<person> details= Arrays.asList(
                new person(1,"naveen"),
                new person(2,"sowji"),
                new person(3,"mag"));
 //details.forEach(a -> System.out.println(a));
 //System.out.println(details);

        Map<Integer,person> detailsInMap= details.stream()
                                         .collect(Collectors
                                         .toMap(person::getId,person -> person));

        System.out.println(detailsInMap);

        System.out.println(detailsInMap.get(4));
    }
}
