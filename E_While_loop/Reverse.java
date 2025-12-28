package E_While_loop;
import java.util.Scanner;

public class Reverse {
    
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
System.out.println("Enter the no you want");

int num = sc.nextInt(); 
sc.close();

while(num > 0) {
            System.out.print(num % 10);
           num /= 10;
        }
}
}