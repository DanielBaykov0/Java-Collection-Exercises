import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        colors.add("green");

        System.out.println(colors);
        colors.offer("white");
        System.out.println(colors);
        colors.offerLast("pink");
        System.out.println(colors);
    }
}