package K_A2D_arrey;
public class Mat_90_rotat {
    public static void main(String[] args) {
        int [][] arr = {{2,3},{5,7}};
        int m = arr.length;
        int n = arr[0].length;
        int[][] res = new int[n][m];

        System.out.println("Original arr");

 for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // Transpose the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[j][i] = arr[i][j];
            }
        }

        // Reverse each row of the transposed matrix for 90 degree rotation

        System.out.println("\n"+"90 degree rotation Arr");
        for (int i = 0; i < n; i++) {
            for (int j = 0, k = m - 1; j < k; j++, k--) {
                int temp = res[i][j];
                res[i][j] = res[i][k];
                res[i][k] = temp;
            }
        }

        // Print the rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
