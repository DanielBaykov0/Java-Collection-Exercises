import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> colors1 = new LinkedList<>();
        colors1.add("red");
        colors1.add("pink");
        colors1.add("white");
        colors1.add("violet");

        LinkedList<String> colors2 = new LinkedList<>();
        colors2.add("blue");
        colors2.add("yellow");
        colors2.add("black");

        LinkedList<String> colors = new LinkedList<>();
        colors.addAll(colors1);
        colors.addAll(colors2);

        System.out.println(colors);
    }
}