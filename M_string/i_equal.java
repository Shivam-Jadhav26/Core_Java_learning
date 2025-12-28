package M_string;

public class i_equal {
    public static void main(String [] args){
        String s = "abcd";
        String  b = "abcd";
        String c = "ab";
        c= c+"cd";


         System.out.println(s==b);      // ye method wrong hai 

         System.out.println(s.equals(b));

         System.out.print("\n");
         System.out.println(s==c);   // ye string ke Address ko  compair karta hai to yenot that much Accurate    

                  System.out.println(s.equals(c));

    }
    
}
