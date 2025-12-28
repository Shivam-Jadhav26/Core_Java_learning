package K_A2D_arrey;
public class transpose_2D {

    public static void main(String[] args) {
        int [][] arr = {{2,3},{5,7}};
        int m = arr.length;
        int n = arr[0].length;

        int [][] res = new int[n][m]; // Transposed array size

        // Transpose logic
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[j][i] = arr[i][j];
            }
        }

         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
                    System.out.println("\n"+"transposed");


        // Print transposed array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
