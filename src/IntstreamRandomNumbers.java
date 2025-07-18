import java.util.stream.IntStream;

public class IntstreamRandomNumbers {

    public static void main(String[] args){

    IntStream.range(0,5).map(i  -> (int) (Math.random()*101)).forEach(System.out::println);
    }
}
