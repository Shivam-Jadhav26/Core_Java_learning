import java.util.Arrays;
public class Arrey_sorting {
    public static void main(String [] args){

        int[] arr= {23,44,65,675,3,2,35,78,9};

        for (int i = 0; i< arr.length;i++ ){
 System.out.print(arr[i]+" ");
        }
       Arrays.sort(arr);
       System.out.println();
              System.out.println(" sorted arr");


for(int i =0 ;i<arr.length; i++){
    System.out.print(arr[i]+" ");
}

    }
    
}
