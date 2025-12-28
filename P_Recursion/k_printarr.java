

package P_Recursion;

public class k_printarr {

    public static void print(int i, int[] arr) {
        if (i == arr.length) {
            return;
        }

        System.out.println(arr[i]); // print current element
        print(i + 1, arr); // recursive call with next index
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 8, 9, 4};

        print(0, arr);
    }
}
