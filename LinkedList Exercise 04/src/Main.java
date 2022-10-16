import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("orange");
        colors.add("white");
        colors.add("blue");
        colors.add("green");
        colors.add("black");

        Iterator<String> iterator = colors.descendingIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}