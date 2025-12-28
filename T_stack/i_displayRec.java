package T_stack;

import java.util.Stack;

public class i_displayRec {
    public static void displayrev(Stack<Integer> st){
        if (st.size()==0){
            return;
        }else{
            int top = st.pop();
            // System.out.println(top);
            displayrev(st);
            System.out.print(top+" ");

            st.push(top);

        }
    }
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.print("The stsck elsement is : ");

        displayrev(st);
    }
    
}

    

