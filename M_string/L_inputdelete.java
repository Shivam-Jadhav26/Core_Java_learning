package M_string;

public class L_inputdelete {

    public static void main(String [] args){

        StringBuilder sb = new StringBuilder("abcdef");
        sb.deleteCharAt(3);

        System.out.println(sb);

        sb.insert(2,"nsns"); // format == index , string ;
        System.out.println(sb);

    } 
    
}
