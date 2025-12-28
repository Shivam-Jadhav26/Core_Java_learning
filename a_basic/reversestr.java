package A_Besic.a2basic;

public class reversestr {
    public static void main(String[] args) {
        String str = " jay shree ram ";
        int len = str.length();

        for (int i = len - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            System.out.print(ch);
        }
    }

}
