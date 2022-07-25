public class Main {
    public static void main(String[] args) {
//        String text = "My age is ";

        int age = 33;
        int year = 1988;

        int a = 33;
        int b = 1988;
        int c = 22;

        //https://dzone.com/articles/java-string-format-examples

        System.out.println(String.format("My age is %d and I was borned in %d", age, year));
        System.out.println(String.format("%d %d %d", a, b, c));

    }
}
