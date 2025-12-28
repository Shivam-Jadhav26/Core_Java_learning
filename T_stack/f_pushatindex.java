package T_stack;

import java.util.Stack;

public class f_pushatindex {
    public static void main(String[] args) {
        var st = new Stack<>();
        int index = 4;
        int target = 99;

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);


        var bt = new Stack<>();

        while (st.size()>index-1){
            bt.push(st.pop());
        }
         
        st.push(target);

        while(bt.size()>0){
            st.push(bt.pop());

        }
        System.out.println("the new st is : "+ st);
    }
    
}
