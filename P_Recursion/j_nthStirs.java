package P_Recursion;
import java.util.Scanner;
public class j_nthStirs {

    public static int possiblity(int num){
        if (num<=2)return num;
        int ans = possiblity(num-1)+possiblity(num-2); 
        return ans;
    }
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the NO: ");
    int num = sc.nextInt();

    // possiblity(num);
    System.out.println(possiblity(num));
        sc.close();


    }
    
}
