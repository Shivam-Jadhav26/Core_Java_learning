package K_A2D_arrey;
import java.util.Scanner;
public class A2d_arr_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][]arr = new int[2][3];
        System.out.println("Enter the no in "+arr.length+"*"+arr[0].length+" arr");

        for(int i=0 ; i<2; i++){

        for (int j = 0; j<3;j++){
            arr[i][j] =sc.nextInt();

        }
        }
sc.close();

for(int i=0; i<arr.length; i++){

    for(int j= 0 ; j<arr[0].length; j++)
{
    System.out.print(arr[i][j]+" ");
}
System.out.println();

}


    }
    
}
