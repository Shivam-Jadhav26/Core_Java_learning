package S_link_list;
class node{
    int val ;
    node next ;

    node(int data){
        this.val=data ;
        this.next=null;
    }


// public class a_ll {
//     static void Print(node head){
//     node temp = head;
//     while (temp != null){
//   System.out.println(temp.val);
//   temp = temp.next;
//     }
//  }
    public static void main(String[] args) {
        node a= new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);

        a.next = b;
        b.next = c;
        c.next = d;


        System.out.println(" "+ a.val);
                System.out.println(" "+ a.next.val);
        System.out.println(" "+ a.next.next.val);
        System.out.println(" "+ d.val);
// Print(a);


    }
}
