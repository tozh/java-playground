import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
    public class Node {
        int val;
        int min;
        Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    Deque<Node> dq;

    /** initialize your data structure here. */
    public MinStack() {
        dq = new LinkedList<Node>();
    }

    public void push(int x) {
        if(dq.isEmpty()) {
            dq.push(new Node(x, x));
        }
        else {
            int min = dq.peek().val;
            int realMin = x<min?x:min;
            dq.push(new Node(x, realMin));
        }

    }

    public void pop() {
        if(!dq.isEmpty())
            dq.pop();
    }

    public int top() {
        return dq.peek().val;
    }

    public int getMin() {
        return dq.peek().min;
    }
}