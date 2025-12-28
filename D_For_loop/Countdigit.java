package D_For_loop;
import java.util.Scanner;

public class Countdigit{
    
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
System.out.println("Enter the no you want");

int num = sc.nextInt(); 
sc.close();

int no = 0;
for( no=0; num>0; no++){

num/=10;
System.out.print(num%10 + " "); // Print the last digit
}
System.out.println(); // Print a new line after the loop
System.out.println(no);
}
}