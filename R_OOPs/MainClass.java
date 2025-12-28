package R_OOPs;

class student {
    String naam;
    String subject;
    int age;
}

class MainClass {
    public static void main(String[] args) {
        // Create Car object and set values
        Car myCar = new Car();
        myCar.name = "Swift";
        myCar.brand = "Maruti";
        myCar.price = 700000;

        // Print Car details
        System.out.println("Car Details:");
        System.out.println("Name: " + myCar.name);
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Price: " + myCar.price);

        // Create student object and set values
        student s1 = new student();
        s1.naam = "Rahul";
        s1.subject = "Math";
        s1.age = 20;

        // Print student details
        System.out.println("\nStudent Details:");
        System.out.println("Naam: " + s1.naam);
        System.out.println("Subject: " + s1.subject);
        System.out.println("Age: " + s1.age);
    }
}
