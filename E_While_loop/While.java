package E_While_loop;
import java.util.Scanner;
public class While{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the number ");
int a = sc.nextInt();
int num = 1;
int sum = 0;
// Using a while loop to print numbers from 1 to a
while(num<=a){
System.out.println(num);
num++;
}
// Using a while loop to calculate the sum of numbers from 1 to a
num = 1; // Reset num to 1 for sum calculation
while(num <= a) {
    sum =sum+ num;
    num++;
}
    System.out.println("The sum is: " + sum);
sc.close();
	}
}
