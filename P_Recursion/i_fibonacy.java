package P_Recursion;

import java.util.Scanner;

public class i_fibonacy {
    public static int fibo ( int b){
        if (b<=1)return b;
        int ans = fibo(b-1)+ fibo( b-2);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the no: ");
        int a = sc.nextInt();

int ans = fibo(a);
System.out.println(ans);
sc.close();
    }
    
}
