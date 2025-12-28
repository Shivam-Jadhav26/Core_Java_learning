package Q_marge_sort;

public class a_marge_twoSortedarr {
    public static void main(String[] args){
        int[] arr = {2, 4, 26, 37, 48, 59};
        int[] brr = {1, 3, 34, 47, 58, 69, 242};
        int[] crr = new int[arr.length + brr.length];

        int i = 0, j = 0, k = 0;

        while (i < arr.length && j < brr.length) {
            if (arr[i] < brr[j]) {
                crr[k++] = arr[i++];
            } else {
                crr[k++] = brr[j++];
            }
        }

        while (i < arr.length) {
            crr[k++] = arr[i++];
        }

        while (j < brr.length) {
            crr[k++] = brr[j++];
        }

        for (int ele : crr) {
            System.out.print(ele + " ");
        }
    }
}





// package Q_marge_sort;

// public class a_marge_twoSortedarr {
//     public static void main(String[] args){
//         int[] arr ={2,4,26,37,48,59 };
//         int [] brr = {1,3,34,47,58,69,242};
//         int c;
        
//         if (arr.length>brr.length){
//                 c = arr.length;
//         }else {
//             c= brr.length;

//         }

//         int [] crr = new int[arr.length +brr.length];

//         for (int i=0; i<c-1; i++){  
//             for (int j=0; j<c-1; j++){
//                 if (arr[i]<brr[i]){
//                     crr[i]=arr[i];

//                 }else {
//                  crr[i]=brr[j];

//                 }
//             }
//         }

//         for (int ele : crr) {
            
//             System.out.print(ele+" ");

            
//         }

//     }
    
// }
