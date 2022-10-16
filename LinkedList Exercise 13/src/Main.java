import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("white");
        colors.add("yellow");

        System.out.println(colors);
        colors.removeFirst();
        colors.removeLast();
        System.out.println("After first and last remove = " + colors);
    }
}