import java.util.LinkedList;

public class Stack_List {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Popped: " + stack.pop()); // 20
    }
}

class LinkedStack {
    // We use a LinkedList instead of int[] array
    private LinkedList<Integer> list = new LinkedList<>();

    // Push: Add to the "top" (Head of list)
    public void push(int value) {
        list.addFirst(value);
    }

    // Pop: Remove from the "top" (Head of list)
    public int pop() {
        if (list.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return list.removeFirst();
    }

    // Comparison Note:
    // 1. No "Stack Overflow" checks needed (List grows dynamically).
    // 2. No "top" index integer needed (Head is always top).
}