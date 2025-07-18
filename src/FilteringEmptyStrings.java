import java.util.Arrays;
import java.util.List;

//Filter out all empty strings from a list and then count the remaining ones.
public class FilteringEmptyStrings {

    public static void main(String[]args){

        List<String> listofStings= Arrays.asList("naveen","mnr","","sowji");

       Long emptyStrings= listofStings.stream().filter(String::isEmpty).count();

       System.out.println("Count of Empty Strings  : " + emptyStrings);

        Long nonEmptyStrings= listofStings.stream().filter(s -> s !=null && s.isEmpty() == false ).count();

        System.out.println("Count of NonEmpty Strings  : " + nonEmptyStrings);

    }
}
