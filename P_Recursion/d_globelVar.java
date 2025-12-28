package P_Recursion;

import java.util.Scanner;

public class d_globelVar {
    public class c_forword {
       static int  n;
    public static void print(int x ){
        if (n<x)return;         // Base cse 
        System.out.println(x);      // work
        print(x+1);              // self call

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();

        print(1);
        sc.close();

    }
}

    
}
