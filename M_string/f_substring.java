package M_string;
public class f_substring {
    public static void main(String[] args){

        String sc = "abcdef";

        System.out.println(sc.substring(1));
                System.out.println(sc.substring(1,3));

                        // System.out.println(sc.substring(3,1)); is not possible in java
        System.out.println(sc.substring(0));
        System.out.println(sc.substring(2,2));


        // print all substring 

        for (int i=0 ; i<sc.length(); i++){
            for (int j= i+1; j<sc.length(); j++){
                System.out.print(sc.substring(i,j)+" ");
            }
            System.out.println();
        }

    }
    
}
