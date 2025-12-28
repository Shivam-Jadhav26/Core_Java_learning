package A_Besic.a2basic;

public class countword {
    
    public static void main(String[] args) {
     String str = "jay shree ram";
     int len  = str.length();
     int word =1 ;
    for (int i = 0 ; i <= len-1 ; i++){
        char ch = str.charAt(i);

        if (ch ==' '){
            word++;
        }
    }
    System.out.println(word);   
    }
    
}
