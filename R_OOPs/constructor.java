package R_OOPs;

public class constructor {

    // Make 'man' a static nested class so it can be used in static main method
    static class man {
        int id;
        int age;
        int sal;

        man() {
            // Default constructor
        }

        man(int id, int age, int sal) {
            this.id = id;
            this.age = age;
            this.sal = sal;
        }
    }

    public static void main(String[] args) {
        // Create objects using parameterized constructor
        man m1 = new man(2, 6, 8);
        man m2 = new man(6, 6, 8);

        System.out.println(m1.id);
        System.out.println(m2.age);
    }
}
