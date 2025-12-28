package S_link_list;

class sll {
    node head;
    node tail;
    int size;

    void insertAtEnd(int val) {
        node temp = new node(val);
        if (head == null)
            head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;

    }

    void Print() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;

        }
        System.out.println();
    }  
}

public class e_Add_ll {

    public static void main(String[] args) {
        sll list = new sll();
        list.insertAtEnd(23);
        list.insertAtEnd(53);
        list.insertAtEnd(23);
        list.insertAtEnd(63);
        list.insertAtEnd(93);

        list.Print();
        System.out.println(list.size);

    }

}
