package T_stack;

import java.util.Stack;

public class b_stackreversey {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> rt = new Stack<>();

        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        System.out.println(st);
        
        while (!st.isEmpty()) {
            rt.push(st.pop());
        }
        System.out.println(rt);
    }

}
