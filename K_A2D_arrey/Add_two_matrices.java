package K_A2D_arrey;

public class Add_two_matrices {
    
    public static void main(String[] args){
        int [][] arr = {{23,45,67,78,56,34},{34,56,6,789,23,38}};
        int [][] brr = {{23,45,67,78,56,34},{34,56,6,789,23,38}};

int[][] sum= new int[arr.length][arr[0].length];

for (int i= 0 ; i<arr.length; i++){

    for (int j=0;j<brr[0].length; j++){
        sum[i][j] = arr[i][j]+brr[i][j];
    }
}

for (int i= 0 ; i<arr.length; i++){

    for (int j=0;j<brr[0].length; j++){
        System.out.print(sum[i][j]+" ");
    }
    System.out.println();
}

    }
}
