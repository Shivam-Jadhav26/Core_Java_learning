package O_Searching;

public class c_upperbond {
    public static void main(String [] args ){
        int[] arr = {2,4,5,7,8,9,11,33,55,76,98,99};
        int l = arr.length ;
        int low = 0;
        int high = l-1;
        int target = 55;
        boolean flag = false;


        while (low <= high ){
            int mid = (high +low)/2;
            if (target <arr[mid]){
                high =mid-1;
            }else if (target >arr[mid]){
                    low =mid +1;
                 } else if (target==arr[mid]){
                    System.out.println("find");

                    flag = true;
                    }
                    if (flag)break;

               
        }


    }
    
}
