import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("white");
        colors.add("black");
        colors.add("green");

        System.out.println("Initial array size = " + colors.size() + ", " + colors);
        colors.ensureCapacity(6);
        colors.add("white");
        colors.add("green");
        System.out.println("Array size = " + colors.size() + ", " + colors);

    }
}