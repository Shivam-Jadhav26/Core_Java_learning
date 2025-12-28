package T_stack;

class Stackk {
    int size = 5;
    private int[] arr = new int[size];
    private int idx = 0;

    void push(int ele) {
        if (idx < size) {
            arr[idx] = ele;
            idx++;
        } else {
            System.out.println("Not enough Space");
        }
    }

    int pop(){
        if(idx == 0 ){
            System.out.println("Stack is empty (underflow)");
            return -1;
        }else{
            int top = arr[idx-1];
            idx--;
             arr[idx] = 0;
             return top;
        }
    }

    int peek(){
        if (idx == 0) {
            System.out.println("Stack is empty (underflow)");
            return -1; // Or throw an exception
        } else {
            return arr[idx - 1];   // The top element is at index idx - 1
        }
    }

    void display(){
        for (int i =0  ; i<=idx-1 ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    int size(){
       return idx; 
    }

}

class k_arreyimplementationStk {

    public static void main(String[] args) {
        Stackk st = new Stackk();
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
