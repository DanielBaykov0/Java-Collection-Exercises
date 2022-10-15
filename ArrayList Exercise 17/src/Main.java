import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("brown");
        colors.add("blue");
        colors.add("green");

        System.out.println(colors);
        colors.removeAll(colors);
        System.out.println("colors after removeAll --> " + colors);
    }
}