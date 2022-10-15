import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("black");
        colors.add("white");
        colors.add("orange");

        System.out.println(colors);

        boolean isEmpty = colors.isEmpty();

        System.out.println("Is arrayList empty ? = " + isEmpty);
    }
}