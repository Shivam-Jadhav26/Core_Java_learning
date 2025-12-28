package K_A2D_arrey;

public class B2D_for_each_loop {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{5,6,7,8}};

        for(int[] ele :arr){
            for (int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
            
        }
    }
    
}
