package C_If_loop;

import java.util.Scanner;

class even {
public static void main( String []args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the no to cheack even or odd");

int a = sc.nextInt();

if(a%2==0){
System.out.println("the no "+a+" is a even no");

}else{
System.out.println("the no "+a+" is a odd");
}




/// // method 2 to solve these 
/// ye example hai********* tarnary oppeter ******ka 
/// 
String answer = (a % 2 == 0) ? "even" : "odd";
System.out.println("the no " + a + " is " + answer + " no");
sc.close();
	}
	}  

