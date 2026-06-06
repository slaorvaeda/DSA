import java.util.Scanner;

public class First {

    public static void traverse(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            if(temp.next != null){
                System.out.print("-> ");
            }
            temp = temp.next;
        }
    }

    public static void search(Node head, int key){
        Node temp = head;
        int position = 1;
        boolean found = false;
        while (temp != null) {
            if(temp.data == key){
                System.out.println("Element " + key + " found at position: " + position);
                found = true;
                break;
            }
            temp = temp.next;
            position++;
        }
        if(!found){
            System.out.println("Element " + key + " not found in the linked list.");
        }
    }
    public static void main(String[] args) {

        // // Create the first node (head of the list)
        // Node head = new Node(10);

        // // Link the second node
        // head.next = new Node(20);

        // // Link the third node
        // head.next.next = new Node(30);

        // // Link the fourth node
        // head.next.next.next = new Node(40);

        //n input liked list from user

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes in the linked list: ");
        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of node " + (i + 1) + ": ");
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // printing linked list
        traverse(head);
        // searching for an element
        System.out.print("\nEnter the element to search: ");
        int key = sc.nextInt();
        search(head, key);
    }
}
