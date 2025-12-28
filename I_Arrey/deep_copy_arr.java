import java.util.Arrays;
public class deep_copy_arr {
    public static void main(String[] args){

int [] arr ={23,3,456,6,75,6434,4,457};
for (int ele :arr){
    System.out.print(ele +" ");
}

System.out .println("\n"+"niche  brr wala hai ");

// ye kaam ka hai 

int [] brr = Arrays.copyOf(arr,arr.length); // ye line case sensetive hai so Barobar

for (int ele :brr){
    System.out.print(ele +" ");
}
    }
}
