import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> colors1 = new LinkedList<>();
        colors1.add("red");
        colors1.add("green");
        colors1.add("black");

        LinkedList<String> colors2 = new LinkedList<>();
        colors2.add("red");
        colors2.add("green");
        colors2.add("black");

        System.out.println(colors1.equals(colors2));
    }
}