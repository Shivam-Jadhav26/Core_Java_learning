package E_While_loop;
import java.util.Scanner;
 public class Noofdig {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
System.out.println("Enter the no you want");

int num = sc.nextInt(); 

int noofdig =0;

while(num>0){
    num /=10;
noofdig++;
}
System.out.println("the no is "+noofdig);
sc.close();

}

}

// This code counts the number of digits in a given integer input by the user.
