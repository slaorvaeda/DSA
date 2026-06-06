public class Node {
    
    int data; // store the valeue of node (type : global variable)

    //pointer to the next node
    Node next; // store the reference of next node

    // constructor to initialize the node
    public Node(int data) {
        this.data = data; // initialize the data of node
        this.next = null; // initialize the next pointer to null
    }
}
