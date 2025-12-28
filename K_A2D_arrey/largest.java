package K_A2D_arrey;

public class largest {
    public static void main (String[] args ){

        // int [][] arr = new int[3][3];
        int [][] arr = {{14,42,53,74,95,16}, {2,345,67,78,87,84}};

        int largest = 0;
        for(int i = 0; i<arr.length ; i++){
            for (int j=0; j<arr[0].length;j++){

                if (arr[i][j]>largest){

                    largest=arr[i][j];

                }
            }

        }
        System.out.println(largest);

         for(int i = 0; i<arr.length ; i++){
            for (int j=0; j<arr[0].length;j++){

                System.out.print(arr[i][j]+" ");

    }
System.out.println();
  
}
    }
}
