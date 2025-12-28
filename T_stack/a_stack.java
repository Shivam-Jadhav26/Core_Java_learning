package T_stack;

import java.util.*;

public class a_stack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());

        st.push(1);
        st.push(3);
        st.push(4);

        // peek

        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.isEmpty());

        st.pop();
        System.out.println(st);

        st.pop();
        System.out.println(st);

        System.out.println("the size is :  " + st.size());

        while (st.size() > 1) {
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st);

    }
}
