package T_stack;

import java.util.Stack;

public class c_stackcopy {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> rt = new Stack<>();
        Stack<Integer> ct = new Stack<>();
        
        // 1. Add elements to the original stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Original Stack (st): " + st);
        
        // 2. Move elements from st to rt (reverses the order)
        // The best way to do this is to loop until the stack is empty.
        while(!st.isEmpty()){
            rt.push(st.pop());
        }

        System.out.println("Reversed Stack (rt): " + rt);

        // 3. Move elements from rt to ct (reverses again, restoring original order)
        while(!rt.isEmpty()){
             ct.push(rt.pop());
        }

        System.out.println("Copied Stack (ct): " + ct);
    }

    
}
