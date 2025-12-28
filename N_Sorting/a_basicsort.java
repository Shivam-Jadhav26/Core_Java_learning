package N_Sorting;
class a_basicsort{



public static void main(String [] args){

int [] arr = {2,3,4,5,2,6,7,8};
boolean issort = true ;
for (int i = 0; i<arr.length; i++){
    if (arr[i]> arr[i+1]){
        issort =false;
        break;
    }
}
if (issort==true){
    System.out.println("sorted");

}else {
    System.out.print("unsorted");
}
}
    
}




// package N_Sorting;

// public class a_basicsort {
//     public static void main(String[] args) {

//         int[] arr = {2, 4, 6, 7, 4, 8, 9};

//         boolean isSorted = true;  // Assume sorted initially

//         for (int i = 0; i < arr.length - 1; i++) {
//             if (arr[i] > arr[i + 1]) {
//                 isSorted = false; // Found an unsorted pair
//                 break;
//             }
//         }

//         if (isSorted) {
//             System.out.println("Sorted array");
//         } else {
//             System.out.println("Unsorted array");
//         }
//     }
// }
