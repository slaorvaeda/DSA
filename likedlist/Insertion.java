class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Insertion {
    Node head; // head of the linked list

    void insertAtBeginning(int data) {
        Node newNode = new Node(data); // create a new node with the given data

        newNode.next = head; // point the new node's next to the current head
        head = newNode; // update the head to the new node
    }


    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head; // start from the head and traverse to the end of the list
        while (temp.next != null) { // keep moving to the next node until we reach the last node (where next is null)
            temp = temp.next;
        } //O(n) time complexity for traversing to the end of the list

        temp.next = newNode;
    }

    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    


    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Insertion list = new Insertion(); // create a new linked list

        list.insertAtBeginning(30); // insert 30 at the beginning
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.insertAtBeginning(5);

        list.insertAtEnd(40);
        list.insertAtEnd(50);

        list.insertAtPosition(25, 4); // insert 25 at position 3

        list.display();
    }
}