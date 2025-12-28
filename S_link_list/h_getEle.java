package S_link_list;

class linkop {
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

    int getele(int index){
        // node temp = new node(index);
        if (index ==1 ){
            return head.val;
        }else {
        node x = head;
        for (int i=1 ; i < index-1 ; i++){
             x= x.next;
        }
                    return x.next.val;
    }
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

public class h_getEle {

    public static void main(String[] args) {
        linkop list = new linkop();
        list.insertAtEnd(23);
        list.insertAtEnd(53);
        list.insertAtEnd(43);
        list.insertAtEnd(63);
        list.insertAtEnd(93);

        list.Print();
        System.out.println(list.size);

        System.out.println(list.getele(5));

    }

}
