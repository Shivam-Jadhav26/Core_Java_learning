package R_OOPs;
class name {
    // private String nana ;  // ye private class ke bahar hai to Access nahi hoga 
    String nani;
}
public class d_private {

    static class student {
       private String name = "shivam"; // ye private class ke aander hai to acces hoga 
        String sname = " jadhav";
        int mark = 23;

    }

    public static void main(String[] args) {
        student s = new student();
        s.mark= 434;
        s.name = "Shivam";

        name n = new name();
        n.nani =" ram";
        // n.nana = "daj "
                System.out.println(n.nani );


        System.out.println(s.name );
    }
    
}
// +++++++++++++++++++++++++++++++++++
/*
private == same class;
public == any where;
default = = same package ;

 
 */