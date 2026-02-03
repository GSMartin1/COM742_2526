public class Node {
    int data;       // The value we want to store
    Node next;      // The pointer to the next Node in memory

    public Node(int data) {
        this.data = data;
        this.next = null; // By default, there is no next node
    }
}