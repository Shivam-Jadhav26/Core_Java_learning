package M_string;
import java.util.Scanner;
public class j_strBuilder {
    
    public static void main (String[] args){


        StringBuilder sb = new StringBuilder("raghv");
        System.out.println(sb);

        System.out.println(sb.length());

 // by default capicity 16 maintain rehti hai 

        StringBuilder sc= new StringBuilder(10);// capicity set kar sakte
        System.out.println(sc.capacity()); 

// reverse functin 
        StringBuilder sd= new StringBuilder("Shivam");
        System.out.println(sd.reverse());

// method 1 to take input 
        System.out.println("\n"+"Enter the StringBuilder");
        Scanner m = new Scanner(System.in);
        StringBuilder sf = new StringBuilder(m.nextLine());
        System.out.println(sf);


// method 2 to take input 
         System.out.println("\n"+"Enter the StringBuilder");

        String sg = m.nextLine();
        StringBuilder se = new StringBuilder(sg);
        System.out.println(se);


        m.close();


    }
}
