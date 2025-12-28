package C_If_loop;
import java.util.Scanner;
public class divisible{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the number ");
float a = sc.nextFloat();

if(a%5==0 && a%3==0){
System.out.println("the no is ok ");
}else{
System.out.println("the is not ok 53");
}

// method 2 to solve these 


if(a%5==0){
	if(a%3==0){
System.out.println("the no is good to 53");
}
	}
else{
System.out.println("The is not Good to 53");
}
sc.close();

	}
}
