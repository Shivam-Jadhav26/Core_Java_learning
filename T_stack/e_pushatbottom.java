package T_stack;

import java.util.Stack;

public class e_pushatbottom {
public static void main(String[] args) {
    var st = new Stack<>();

     st.push(12);
     st.push(132);
     st.push(125);
     st.push(122);
     st.push(182);
     st.push(92);
    
     System.out.println("the st stack stack is : "+ st);

 var bt = new Stack<>();
 while(st.size()>0){
    bt.push(st.pop());
 }
 bt.push(999);
System.out.println("the bt stack is : "+bt);


// now we create new stack for inserting value a bottom
while(bt.size()>0){
    st.push(bt.pop());
}
System.out.println("the new st is : "+st);

}    
}
