package d3.hackerRank.interviewPrepKit.stacksandqueues;

import java.util.*;

public class MyQueue<E> {

    Stack<Integer> stack = new Stack<>();

    private void dequeue() {
        stack.remove(stack.firstElement());
    }

    private Integer peek() {
        return stack.firstElement();
    }

    private void enqueue(Integer nextInt) {
        stack.push(nextInt);
    }

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
