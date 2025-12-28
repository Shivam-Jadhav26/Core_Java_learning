package S_link_list;

 class masters {
    node head;
    node tail;
    int size;

     masters() {
        head = null;
        tail = null;
        size = 0;
    }

    void insertAthead(int val) {
        node temp = new node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;

        }
    }

    void Print() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;

        }

    }
}

public class f_add_at_head {
    public static void main(String[] args) {
        masters list = new masters();

        list.insertAthead(34);
        list.insertAthead(84);

        list.Print();

    }

}
