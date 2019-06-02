package pl.sda.methods;

public class ClassWithOtherMethods {
    public void dontDoIt() {
        throw new RuntimeException("fail");
    }

    private void callSomething() {
        System.out.println("call me too");
    }

    private void wasItCalled() {
        System.out.println("was it?");
    }
}
