import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("green");
        colors.add("pink");
        colors.add("white");

        System.out.println(colors.peekLast());

    }
}