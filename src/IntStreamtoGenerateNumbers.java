import java.util.stream.IntStream;

public class IntStreamtoGenerateNumbers {

    public static void main(String[] args){

        IntStream.range(0,20).filter(i -> i%2==0).forEach(System.out::println);
    }


}
