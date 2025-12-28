package R_OOPs;

class d_geter {
      private String name;

    // Getter method (to read name)
    public String getName() {
        return name;
    }

    // Setter method (to update name)
    public void setName(String newName) {
        name = newName;
    }
}

public  class d_Main {
    public static void main(String[] args) {
        d_geter s1 = new d_geter();

        // set value using setter
        s1.setName("Shivam");

        // get value using getter
        System.out.println("Student Name: " + s1.getName());
    }
}