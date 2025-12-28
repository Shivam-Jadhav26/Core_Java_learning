package A_Besic.a2basic;

public class palindrome {
    public static void main(String[] args) {
        String a = "manam";
        int len  = a.length();
         String rev ="";
        for(int i = len-1; i>= 0 ; i--){
            rev = rev + a.charAt(i);
        }

        if (a.equals(rev)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
    
}
