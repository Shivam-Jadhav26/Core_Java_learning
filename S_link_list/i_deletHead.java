package S_link_list;

class node {
    int val;
    node next;

    node(int val) {
        this.val = val;
    }
}
class navic {
    node head;
    node tail;
    int size;

    navic() {
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

    void deletHead() {
        if (head == null) return; // safe check
        head = head.next;
        size--;
        if (head == null) tail = null; // if list became empty
    }

    void deleteindex(int index) throws Error {
        if (index < 0 || index >= size) {
            throw new Error("Invalid index!");
        }

        if (index == 0) {
            deletHead();
            return;
        }

        node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        // temp is at index-1
        temp.next = temp.next.next;

        // If last element is deleted → update tail
        if (index == size - 1) {
            tail = temp;
        }

        size--;
    }
}

public class i_deletHead {
    public static void main(String[] args) {
        navic list = new navic();
        list.insertAtEnd(23);
        list.insertAtEnd(53);
        list.insertAtEnd(43);
        list.insertAtEnd(63);
        list.insertAtEnd(93);

        list.Print();
        System.out.println("Size: " + list.size);

        list.deleteindex(4);  // deleting last element (93)

        list.Print();
        System.out.println("Size: " + list.size);
    }
}
