package A_Besic.a2basic;

public class countvovels {
    public static void main(String[] args) {
        
    
    String a = " jay siya ram ";
    int len = a.length();
    int vovel = 0 ;
    int conso = 0 ;

for (int i =0 ; i <=len-1 ; i ++){
    char ch = a.charAt(i);
    if (ch=='a' || ch=='e' || ch=='i' || ch == 'o' || ch =='u' ){
        vovel++;
        
    } else if (ch >= 'a' && ch <= 'z') { // Only count letters as consonants
        conso++;
    }
}

System.out.println("Vowels are: " + vovel);
System.out.println("Consonants are: " + conso);
}
}
