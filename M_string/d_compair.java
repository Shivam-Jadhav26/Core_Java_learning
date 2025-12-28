package M_string;

public class d_compair {
    public static void main(String [] args){

        String sc = "my name is shiva ";
        System.out.println(sc.indexOf('m'));
                System.out.println(sc.indexOf('n'));
        System.out.println(sc.indexOf('y'));
                System.out.println(sc.lastIndexOf('y'));

        String a= "avb";
        String b = "aab";

        System.out.println(a.compareTo(b));

        //  compirto() use ascai value to compaor btwn them and do a-b ;

          String c= "abbggisd";
        String d = "abb";

        System.out.println(c.compareTo(d));

        //  if c and d is different in length then only compair at same length letter 
        // and after only give the remaining letter countt 
    

        String e= "abb";
        String f = "abbggisd";

        System.out.println(e.compareTo(f));

        

    }
    
}

//  compirto() use ascai value to compaor btwn them and do a-b ;

// 