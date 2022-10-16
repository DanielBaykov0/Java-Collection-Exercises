import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("black");

        System.out.println(colors);
        Collections.swap(colors, 1, 3);
        System.out.println("After swap = " + colors);
    }
}