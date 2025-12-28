package P_Recursion;

import java.util.Scanner;

class b_rever{
    public static void print(int n){
        if (n==0)return;
        System.err.println(n);
        print(n-1);

    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        print(p);
sc.close();
    }
}