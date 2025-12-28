import java.util.Scanner; 

class Floyd_Triangle {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows for Floyd's Triangle: ");
//         int n = sc.nextInt();
//         int a = 1;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(a + " ");
//                 a += 1;
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }

public static void main (String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the no you want");

int n = sc.nextInt();

int a = 1;

for (int i=1; i<=n; i++){

for (int j= 1 ; j<=i ; j++){

System.out.print(a+ " ");
a+=1;
}
System.out.println();
	}

    sc.close();
}


}