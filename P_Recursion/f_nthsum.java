package P_Recursion;

import java.util.Scanner;

public class f_nthsum {

    public static void printp(int n, int s){
        if (n==0){
            System.out.println(s);
            return;
        }
         printp(n-1, s+n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        printp(n,0);
            sc.close();

    }
}
