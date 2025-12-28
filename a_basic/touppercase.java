package A_Besic.a2basic;

public class touppercase {
    public static void main(String[] args) {
        String str = "jay shree ram ";

        int len = str.length();

        for (int i = 0; i <= len - 1; i++) {
            char ch = str.charAt(i);
            int b = (int) ch;

            if (b >= 97 && b <= 122) { // Correct ASCII range for 'a' to 'z'
                int c = b - 32; // The difference between 'a' and 'A' is 32
                System.out.print((char) c);

            } else {
                System.out.print((char) b);
            }

        }

    }

}