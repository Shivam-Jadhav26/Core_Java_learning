package A_Besic.a2basic;

public class replacespace {
    public static void main(String[] args) {
        String str = "jay shree ram";
        String nep = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                ch = '-';
                nep = nep + ch;
                // System.out.println("+");
            } else {
                nep = nep + ch;
            }

        }
        System.out.println(nep);

    }
}
