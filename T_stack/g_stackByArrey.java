package T_stack;

import java.util.Stack; // It's good practice to be explicit with imports

public class g_stackByArrey {
    public static void main(String[] args) {
        
        // Using generics is a best practice for type safety
        Stack<Integer> st = new Stack<>();
        
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println("Original Stack: " + st);

        int len  = st.size();
        int [] arr = new int[len];
        // The loop should go from 0 to len-1. The condition i < len ensures this.
        for (int i = 0; i < len; i++){
            arr[i] = st.pop();
        }

        System.out.println("\nElements popped into array:");
        for (int a : arr){
            System.out.print(a + " ");
        }

        for(int i =len-1; i>=0; i--){
            st.push(arr[i]);  
        }
        System.out.println();
        System.out.println(st);
    }
}
