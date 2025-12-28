package T_stack;

import java.util.Stack;

public class m_balencebracket {

    public static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.isEmpty()) {
                    return false; // Closing bracket with no opening one
                }
                st.pop();
            }
        }
        // If stack is empty, all brackets were matched
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "(())()"; // Balanced
        System.out.println("Is \"" + str1 + "\" balanced? " + isBalanced(str1));

        String str2 = "(()"; // Not balanced
        System.out.println("Is \"" + str2 + "\" balanced? " + isBalanced(str2));

        String str3 = ")("; // Not balanced
        System.out.println("Is \"" + str3 + "\" balanced? " + isBalanced(str3));
    }

}
