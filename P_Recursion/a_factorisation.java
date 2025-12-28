package P_Recursion;

import java.util.Scanner;

public class a_factorisation {


      public static int fact(int n){
        if (n==1)return 1; // Base Call
        return n*fact(n-1);  // self call   
        }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int b = fact(n);

System.out.println(b);
sc.close();

      

    }
    
}
