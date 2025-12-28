package S_link_list;

class mastersop {
    node head;
    node tail;
    int size;

    mastersop() {
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
        size++;
    }

    void insert(int index, int val) {
        if (index == 0) {
            insertAthead(val);
        }
        if (index == size) {
            insertAtEnd(val);

        }
        if (index > size) {
            System.out.println(" Index not valid ");
        }
        node temp = new node(val);
        node x = head;

        for (int i = 1; i < index - 1; i++) {
            x = x.next;

        }
        temp.next = x.next;
        x.next = temp;
        size++;

    }

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

public class g_insert {
    public static void main(String[] args) {
        mastersop list = new mastersop();

        list.insertAthead(34);
        list.insertAthead(84);

        list.Print();
        list.insert(2, 47);
        list.Print();

        list.insertAtEnd(87);
        list.insertAtEnd(45);
        list.insert(4, 47);
        list.Print();

    }

}
