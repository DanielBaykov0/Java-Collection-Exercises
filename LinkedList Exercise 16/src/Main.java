import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("black");
        colors.add("white");
        colors.add("yellow");

        System.out.println(colors);
        Collections.shuffle(colors);
        System.out.println("After shuffle = " + colors);
    }
}