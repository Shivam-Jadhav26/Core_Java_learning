package K_A2D_arrey;

public class sumAll_2Dele {
    
    public static void main(String[] args){

        int[][] arr = {{12,45,23,67,23},{56,23,78,90,45}};
        int sum=0;
        int fsum=0;

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr[0].length; j++){

                sum= sum+arr[i][j];

            }
                        System.out.println("\n"+"add of "+ (i+1) +" Arrey is >>>> "+sum);

            System.out.println(sum);
            fsum= fsum+sum;

        }

            System.out.println("\n"+"Full add is >>>> "+fsum);
                        // System.out.println(fsum);


    }
}
