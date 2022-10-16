import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("green");
        colors.add("yellow");
        colors.add("blue");
        colors.add("white");
        colors.add("black");

        ListIterator<String> iterator = colors.listIterator(2);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}