import java.util.Scanner;

class arr_m2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

int [] arr={1,23,4,5,6,7,8,6,5,4};
int l= arr.length;


        // Print array elements
        for (int j = 0; j < l; j++) {
            System.out.print(arr[j]+" ");
        }

        sc.close();
    }
}
