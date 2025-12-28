package S_link_list;
class master {
    int data;
    master next ;

    master (int data){
this.data = data;

    }
}
public class d_reverse_ll {

    static void print(master head ){
        if (head==null){
            return;
        }else{
            print(head.next);
            System.out.println(head.data);
        }
    }

    public static void main(String[] args) {
        master m1 = new master(10);
        master m2 = new master(13);

        master m3 = new master(15);
        master m4 = new master(17);
     
            m1.next = m2 ;
            m2.next = m3 ;
            m3.next = m4 ;
            m4.next = null;
            
        print(m1);
        

        
    }
    
}
