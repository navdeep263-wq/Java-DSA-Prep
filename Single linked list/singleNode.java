public class singleNode {
    //data part of the node
    int data;
    //pointer to the next node
    singleNode next;
    //constructor to initialize the node with data
    public singleNode(int data){
        this.data = data;
        this.next = null;
    }
    public static void main(String[] args) {
        // Create the first node (head of the list)
        singleNode head = new singleNode(10);

        // Link the second node
        head.next = new singleNode(20);

        // Link the third node
        head.next.next = new singleNode(30);

        // Link the fourth node
        head.next.next.next = new singleNode(40);

        // printing linked list
        singleNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
    }
    }
}
