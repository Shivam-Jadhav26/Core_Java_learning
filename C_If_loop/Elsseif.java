package C_If_loop;
import java.util.Scanner;

class Elsseif{
public static void main(String []args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the marks you get");

float marks = sc.nextFloat();

if(marks>90){
System.out.println("excellent");
}else if(marks<80){
System.out.println("good");
}
else if(marks<70){
System.out.println("ok good");

}else if(marks<60){
System.out.println("good");

}else if(marks<50){
System.out.println("avrage");

}else if(marks<40){
System.out.println("notgood");

}else{
System.out.println("fail");

}
sc.close();

}
	}
