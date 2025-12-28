package P_Recursion;

import java.util.Scanner;

public class c_forword {
    public static void print(int x , int n){
        if (n<x)return;         // Base cse 
        System.out.println(x);      // work
        print(x+1, n);              // self call

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        print(1, n);
        sc.close();

    }
}
