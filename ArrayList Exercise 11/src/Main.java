import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("black");
        colors.add("white");

        System.out.println("Before reverse:");
        System.out.println(String.join(", ", colors));

        Collections.reverse(colors);

        System.out.println("After reverse:");
        System.out.println(String.join(", ", colors));
    }
}