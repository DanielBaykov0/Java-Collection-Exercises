import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> colors1 = new LinkedList<>();
        colors1.add("red");
        colors1.add("black");
        colors1.add("yellow");
        colors1.add("pink");

        System.out.println("colors1 = " + colors1);
        LinkedList<String> colors2 = new LinkedList<>();
        colors2 = (LinkedList<String>) colors1.clone();
        System.out.println("colors2 = " + colors2);
    }
}