import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;


public class Versioncomparator implements Comparator<String> {
   int index= -1;
    @Override
    public int compare(String thisString, String thatString) {
        Objects.requireNonNull(thatString);
        Objects.requireNonNull(thatString);
         return 1;
    }

    public String getKeyExtractor(String input) {
        return input.split(".")[++index];
    }
}
