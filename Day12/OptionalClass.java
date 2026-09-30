import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalE {
    public static void main(String[] args) {
        // Optional class is used to over come the nullpoint ex
        List<String> names = Arrays.asList("Srikar","Ramx","Ajay","Laxmi");

        Optional<String> name = names.stream()
                            .filter(str -> str.contains("x"))
                            .findFirst();

       // if we don't have  character then it will rase a  nullpoint ex to overcome that we will use Optional
    }
    
}
