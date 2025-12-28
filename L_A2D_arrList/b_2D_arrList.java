package L_A2D_arrList;
import java.util.ArrayList;
import java.util.List;

public class b_2D_arrList {
    public static void main(String[] args) {

        List<Integer> v = new ArrayList<>();
        v.add(58); v.add(30);

        List<Integer> a = new ArrayList<>();
        a.add(76); a.add(87); a.add(98);

        List<Integer> b = new ArrayList<>();
        b.add(34); b.add(45); b.add(23); b.add(123);

        // Create a 2D ArrayList and add the lists
        List<List<Integer>> m = new ArrayList<>();
        m.add(a);
        m.add(b);
        m.add(v);

        // Print each row of the 2D ArrayList
        for (int i = 0; i < m.size(); i++) {
            System.out.println(m.get(i));
        }
    }
}
