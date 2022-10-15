import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        items.add("ball");
        items.add("hat");
        items.add("coat");
        items.add("leg");

        System.out.println(items);

        items.remove(2);
        System.out.println(items);
    }
}