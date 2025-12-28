package N_Sorting;

public class d_2bubblesort {
    public static void print(int[] arr){
        for (int ele : arr){
            System.out.print(ele+" ");

        }
        System.out.println();

    }

    public static void main(String [] args){
        int arr [] = {2,4,7,4,7,9,1};
int l = arr.length;
        print(arr);
        System.out.println("sorted arr");

        for (int x=0 ;x<l-1;x++){
            for (int i =0; i<l-1-x; i++){

                if (arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1]=temp;
   }                
    }
        }
print(arr);
    }
}


