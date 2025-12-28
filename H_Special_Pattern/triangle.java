import java.util.Scanner;
class triangle {

public static void main( String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the no you want ");

int n = sc.nextInt();

for (int i = 1 ; i<=n ; i++ ){

for(int j= 1; j<=i; j++){

System.out.print((2*j-1)+" ");

}
System.out.println();

	}
sc.close();

	}
}


