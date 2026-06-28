import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>(Arrays.asList("A", "B"));
    list.forEach(System.out::println);
  }
}
