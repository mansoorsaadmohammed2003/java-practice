import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.size());
        st.set(1, 3);
        System.out.println(st);
    }
}
