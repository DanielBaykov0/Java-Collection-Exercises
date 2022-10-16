import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("black");
        colors.add("pink");
        colors.add("violet");

        System.out.println(colors);
        colors.clear();
        System.out.println("After removeAll = " + colors);
    }
}