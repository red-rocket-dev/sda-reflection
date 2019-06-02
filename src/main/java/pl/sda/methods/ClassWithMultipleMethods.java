package pl.sda.methods;

public class ClassWithMultipleMethods {
    public void callMe() {
        System.out.println("hello");
    }

    public void dontMe() {
        System.out.println("not");
    }

    public void callMeMaybe() {
        System.out.println("world");
    }

    void callPackage() {
        System.out.println("my package private secret hello world");
    }

    private void callPrivate() {
        System.out.println("impossible!");
    }

    public void someOther() {
        System.out.println("great!");
    }
}
