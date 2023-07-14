import org.apache.commons.lang3.StringUtils;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(StringUtils.capitalize("hello world!"));

        System.out.println(StringUtils.abbreviate("Hello World", 10));
        System.out.println(StringUtils.getCommonPrefix("Apple", "Application", "Appliance"));
    }
}
