interface A {
    void eat(); // Public and abstract by default
}

class B implements A {
    // Must be declared public when overriding
    @Override
    public void eat() {
        System.out.println("B can eat");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        B b = new B();
        b.eat();
    }
}