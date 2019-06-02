package pl.sda;

public class MyPrivateDumbClass {
    private String someString;
    private static final String SOME_PASSWORD = "adminadmin";

    private MyPrivateDumbClass() {
    }

    public void printSomeString() {
        System.out.println("hello " + someString);
    }


}
