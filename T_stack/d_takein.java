package T_stack;

import java.util.Scanner;
import java.util.Stack;

public class d_takein {
    public static void main(String[] args) {
        var st = new Stack<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of element");
        int n = sc.nextInt();

        System.out.println(" Now Enter the Element in Stack");

        for (int i =0 ; i<=n-1 ; i++){
            int e = sc.nextInt();
            st.push(e);
        }
        System.out.println(st);
        sc.close();

    }
    
}
