package T_stack;

import java.util.Stack;

public class j_indexinrecursion {

    public static void atbottom(Stack<Integer> st, int a ,int idx){
        if (st.size()==idx){
            st.push(a);
            return;
        }else{
            int top = st.pop();
            atbottom(st, a,idx);
            st.push(top);
        }
    }

    
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        
        int index = 1;

        atbottom(st, 99,index-1);
        System.out.println(st);

    }
    
}
