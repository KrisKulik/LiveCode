import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String [] str = {"one", "two", "three", "two", "one", "four", "one", "five", "two"};
        Set<String> set = new LinkedHashSet<>(Arrays.asList(str));
        System.out.println (set);
    }
}