package HelloWorld;

public class HelloWorld {
    public static void main(String[] args) {

        String wow = "!";

        for (int i = 1; i < 5; ++i) {

            System.out.print("Hello World");
            System.out.println(wow);
            wow += "!";
        }
        for (int i = 4; i >= 1; i--) {

            System.out.print("Hello World");
            System.out.println("!".repeat(i));
        }
    }
}
