public class MyLinkedList {
    Node head; // The starting node

    // Method to add a new node to the END of the list
    public void add(int data) {
        Node newNode = new Node(data);

        // Case 1: The list is empty
        if (head == null) {
            head = newNode;
        } else {
            // Case 2: Go to the end
            Node current = head;
            while (current.next != null) { // Keep going until next is null
                current = current.next;    // Move to the next node
            }
            // We found the end. Link the last node to the new node
            current.next = newNode;
        }
    }

    // Method to print the chain visually
    public void printList() {
        Node current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        System.out.println("Building the chain...");
        list.add(10);
        list.add(20);
        list.add(30);

        list.printList();

    }
}