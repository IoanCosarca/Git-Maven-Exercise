import org.apache.commons.lang3.math.NumberUtils;

public class HelloWorld {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        double c = 2.25;
        double d = 4.17;

        System.out.println(NumberUtils.compare(a, b));
        System.out.println(NumberUtils.toInt("45"));
        System.out.println(NumberUtils.max(c, d));
    }
}
