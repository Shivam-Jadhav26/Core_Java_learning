package R_OOPs;

class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 0) {    // only allow positive age
            age = newAge;
        } else {
            System.out.println("Invalid Age!");
        }
    }
}

public class e_Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(-5);   // Invalid Age!
        p.setAge(20);   // set properly
        System.out.println("Age: " + p.getAge());
    }
}
