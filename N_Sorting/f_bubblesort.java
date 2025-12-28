package N_Sorting;

public class f_bubblesort {

    public static void print(int [] arr){
    for (int ele : arr){
        System.out.print(ele+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,4,6};

        int l = arr.length;
        print(arr);

        for (int i =0 ; i<l-1; i++){
        boolean flag = false;
System.out.print(i+" ");
            for (int j =0 ; j<l-1-i; j++){
                if (arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                    flag =true;

                }
            }
            if (flag ==false)break;
        }
        System.out.println();
        print(arr);
    }
}

