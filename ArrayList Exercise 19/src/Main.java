import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("brown");

        System.out.println("Size before trim = " + colors.size());
        colors.trimToSize();
        System.out.println("Size after trim = " + colors.size());
    }
}