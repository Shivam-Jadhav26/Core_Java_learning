package M_string;
import java.util.Scanner;

public class b_string {

    // Input a string and count all the vowels in the given string 

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string Here");
        String s = sc.nextLine();
        sc.close();

        int n = s.length();
        int count = 0; // should start at 0

        for (int i = 0; i < n; i++) { // use < n instead of <= n
            char ch = s.charAt(i);   // define ch here

            if (isVovel(ch) == true){
                count++;
            }
        }

        System.out.println("The count is " + count);
    }

    public static boolean isVovel(char ch){
        if(ch == 'a'|| ch== 'A') return true;
        if(ch == 'e'|| ch== 'E') return true;
        if(ch == 'i'|| ch== 'I') return true;
        if(ch == 'o'|| ch== 'O') return true;
        if(ch == 'u'|| ch== 'U') return true;

        return false;
    }
}
