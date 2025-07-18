import java.util.Arrays;
import java.util.List;

public class Wc {

    public static void main(String[]args){

        List<String> names= Arrays.asList("apurna","rd","sow");

        names.stream().filter(s -> s.toUpperCase().startsWith("A")).forEach(System.out::println);
    }
}
