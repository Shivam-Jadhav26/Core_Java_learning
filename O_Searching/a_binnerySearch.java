package O_Searching;

public class a_binnerySearch {
    public static void main(String[] args) {
        int[] arr = {11, 23, 45, 67, 89, 90, 91, 92, 95};
        int tar = 95;
        int l = arr.length;

        int low = 0;          // use index, not value
        int hi = l - 1;       // last index
        boolean flag = false;

        System.out.println("Length: " + l);
        System.out.println("Highest: " + arr[hi]);
        System.out.println("Lowest: " + arr[low]);

        while (low <= hi) {
            int mid = (low + hi) / 2;

            if (tar > arr[mid]) {
                low = mid + 1;
                System.out.print("ml" + " ");
            } else if (tar < arr[mid]) {
                hi = mid - 1;
                System.out.print("mr" + " ");
            } else {
                flag = true;
                System.out.println("milla at index: " + mid);
                break;
            }
        }

        if (!flag) {
            System.out.println("Not found");
        }
    }
}





// package O_Searching;

// public class a_binnerySearch {
//     public static  void main(String[] args){
// int[] arr ={11,23,45,67,89,90,91,92,95};

// int tar = 89;
//         int l = arr.length;

//         int low= 0;
//         int hi= l-1;
//                 System.out.println(l);

//         System.out.println(hi);
//                 System.out.println(low);

//             boolean flag = false;
//         while (low<=hi){
//            int  mid = (low+hi)/2;

//             if (tar >arr[mid]){
//                 low = mid+1;
//                 System.out.print("ml"+ " ");

//             }else if (tar< arr[mid]){
//                 hi = mid-1;
//                 System.out.print("mr"+ " ");

//             }else if (tar==arr[mid]){
//                     flag = true ;
//                      System.out.print("milla"+ " "+mid);

//             }
//              if (flag == true ){
//             break;
//         }
//         }
       
//     }

//     }
    

