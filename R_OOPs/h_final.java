package R_OOPs;

// Example of final keyword
class Test {
    // final variable (constant)
    final int SPEED_LIMIT = 80;

    void show() {
        System.out.println("Speed Limit: " + SPEED_LIMIT);
    }

    // final method (cannot be overridden)
    final void display() {
        System.out.println("This is a final method.");
    }
}

// final class (cannot be extended)
final class FinalClass {
    void message() {
        System.out.println("This is a final class, no one can inherit it.");
    }
}

public class h_final {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        t.display();

        FinalClass f = new FinalClass();
        f.message();
    }
}
