import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");

        List<String> colors2 = new ArrayList<>();
        colors2.add("brown");
        colors2.add("black");
        colors2.add("white");
        colors2.add("orange");

        System.out.println("Before copy:");
        System.out.println("colors = " + colors);
        System.out.println("colors2 = " + colors2);

        Collections.copy(colors, colors2);

        System.out.println("After copy:");
        System.out.println("colors = " + colors);
        System.out.println("colors2 = " + colors2);
    }
}