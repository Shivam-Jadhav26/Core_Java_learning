package P_Recursion;

public class l_stringele {
    public static void print(int i , String p){
    if (i==p.length())return;
    System.out.println(p.charAt(i));
        print(i+1, p);
    }
    public static void main(String[] args){
        String s = "my name is shivam";
        print(0 ,s);
    }
    
}
