import java.util.stream.IntStream;

public class IntstreamSum {

    public static void main(String[] args){

       int sum= IntStream.range(0,100).sum();
       System.out.println(sum);
    }
}
