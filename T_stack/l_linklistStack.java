package T_stack;


public class l_linklistStack {
   public static class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
    }
    public static class Innerl_linklistStack {
        Node head =null;
        int size =0 ;
        void push (int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp ;
            size++;
        }

        int pop(){
            if(head == null ){
                System.out.println("Stack is empty (underflow)");
                return -1;
            }else{
                int top = head.val;
                head = head.next;
                size--;
                 return top;
            }
        }

        int peek(){
            if (head == null) {
                System.out.println("Stack is empty (underflow)");
                return -1; // Or throw an exception
            } else {
                return head.val;
            }
        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
           return size;
        }
    }
    public static void main(String[] args) {

        Innerl_linklistStack st = new Innerl_linklistStack();
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Top element is: " + st.peek()); // Should be 30
        st.display();
        System.out.println("Popped element: " + st.pop()); // Should be 30
        st.display();
        System.out.println("New top element is: " + st.peek()); // Should be 20
        st.display();
        st.push(40);
        System.out.println("New top element after push: " + st.peek()); // Should be 40
        st.display();

        System.out.println(st.size());
        
    }
    
}
