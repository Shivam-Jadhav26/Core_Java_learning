package M_string;
import java.util.Scanner;

public class k_toggel_letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");

        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);

        int n = sb.length();
        for (int i = 0; i < n; i++) {
            char ch = sb.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 65 && ascii <= 90) { // Capital letter
                ascii += 32;
                ch = (char) ascii;
                sb.setCharAt(i, ch);
            } else if (ascii >= 97 && ascii <= 122) { // Small letter
                ascii -= 32;
                ch = (char) ascii;
                sb.setCharAt(i, ch);
            }
        }
        sc.close();

        System.out.println("Toggled string: " + sb.toString());
    }
}


/* 
import java.util.Scanner;

public class k_toggel_letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");

        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            // char mh = (int)ch ;

            if (ch >= 'A' && ch <= 'Z') {
                // Uppercase to lowercase
                ch = (char)(ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                // Lowercase to uppercase
                ch = (char)(ch - 32);
            }
            sb.setCharAt(i, ch);
        }
sc.close();
        System.out.println("Toggled string: " + sb.toString());
    }
}
*/
/* 



*/