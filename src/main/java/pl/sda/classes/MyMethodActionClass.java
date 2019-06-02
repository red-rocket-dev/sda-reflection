package pl.sda.classes;

public class MyMethodActionClass {
    public static void test() {
        System.out.println("You shouln't call me :(");
    }

    @Action
    public static void callMe() {
        System.out.println("That's ok");
    }

    @Action
    public static void someOtherMethod(String passHereSomething) {
        System.out.println("That's ok");
    }

    @Action
    public static int method(String passHereSomething) {
        System.out.println("Great!");
        return 0;
    }
}
