package P_Recursion;

import java.util.Scanner;

public class h_logpower {
    public class g_power {
    public static int power(int a,int b){
        if (b==0)return 1;
        int ans = power(a,b/2);
        if (b%2==0)return ans*ans;
        else return ans*ans*a; 
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int a = sc.nextInt();
        System.out.println("Enter the power");
        int b = sc.nextInt();

        power(a, b);

        // int aa = power(a,b);

        System.out.println(power(a,b));
        sc.close();
    }

}

    
}
