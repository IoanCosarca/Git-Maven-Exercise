import org.apache.commons.lang3.math.NumberUtils;

import org.apache.commons.lang3.StringUtils;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Main");
        System.out.println("New program");
        int a = 3;
        int b = 5;
        double c = 2.25;
        double d = 4.17;

        System.out.println(NumberUtils.compare(a, b));
        System.out.println(NumberUtils.toInt("45"));
        System.out.println(NumberUtils.max(c, d));
        System.out.println("Hello World!");
        System.out.println(StringUtils.capitalize("hello world!"));

        System.out.println(StringUtils.abbreviate("Hello World", 10));
        System.out.println(StringUtils.getCommonPrefix("Apple", "Application", "Appliance"));
    }
}
