import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("pink");

        System.out.println(colors);

        LinkedList<String> colors1 = new LinkedList<>();
        colors1.add("white");
        colors1.add("black");

        colors.addAll(0, colors1);
        System.out.println(colors);

    }
}