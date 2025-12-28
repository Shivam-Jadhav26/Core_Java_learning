package A_Besic.a2basic;

class uniquechar {
    public static void main(String[] args) {
        String str = "jay shree ram ";
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);

            // Check if the character is NOT already in the result string
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}
