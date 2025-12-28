package M_string;

import java.util.Scanner;

public class c_string {

    // Input a string and count all the vowels in the given string 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string Here:");
        String s = sc.nextLine();
        sc.close();

        int count = 0;  // start with 0 not 1

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);  // get each character
            if (isVowel(ch)) {
                count++;
            }
        }

        System.out.println("The count of vowels is: " + count);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // convert to lowercase for simplicity
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}
