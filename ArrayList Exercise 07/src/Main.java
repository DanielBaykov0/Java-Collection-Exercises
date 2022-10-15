import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        items.add("hat");
        items.add("belt");
        items.add("armor");
        items.add("sword");

        if (items.contains("sword")) {
            System.out.println("Found element");
        } else {
            System.out.println("No such element");
        }
    }
}