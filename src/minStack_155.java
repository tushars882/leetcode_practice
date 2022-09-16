import java.util.Stack;
//here we have made two stacks to keep the track of mininmum so later we can pop it out and the normal stack for normal operations
public class minStack_155 {
    static Stack<Integer> st = new Stack<>();
    static Stack<Integer> min = new Stack<>();
    static void push(int n){
//        st.add(n);
        if(min.isEmpty() || n <= min.peek() ){
            min.push(n);
        }
        st.push(n);
    }
    static void pop(){
    if(st.peek().equals(min.peek())){               //suppose the element on the top of both are equal and we are supposed to temove thst from the stack so we will remove it from minstack as well as there should not be anyy element in minstack which has already been removed from stack
        min.pop();
    }
    st.pop();
    }
    static int top(){
        return st.peek();
    }
    static int getMin(){
        return min.peek();
    }

    public static void main(String[] args) {
        push(2);
        push(1);
        push(8);
        System.out.print(top());
        System.out.println();
        System.out.print(getMin());
    }
}
