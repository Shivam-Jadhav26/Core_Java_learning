package S_link_list;

public class c_print_reccursive_ll {
    
   
  static void Print(node head){
    if (head ==null)return;
    else {
        System.out.println(head.val);
        Print(head.next);

    }


  }
    
        public static void main(String[] args) {
             node a= new node(10);
            node b = new node(20);
            node c = new node(30);
            node d = new node(40);
    
            a.next = b;
            b.next = c;
            c.next = d;
            Print(a);
            
        }

}
