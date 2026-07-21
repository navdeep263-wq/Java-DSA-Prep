public class insertAtBeg {
    int data;
    insertAtBeg next;

    public insertAtBeg(int data){
        this.data = data;
        this.next = null;
    }
    public static void main(String[] args) {
        insertAtBeg head = new insertAtBeg(2);
        head.next = new insertAtBeg(3);
        head.next.next = new insertAtBeg(4);
        head.next.next.next = new insertAtBeg(5);
        head.next.next.next.next = new insertAtBeg(6);

         // Create new node
        insertAtBeg newNode = new insertAtBeg(1);

        // Insert at beginning
        newNode.next = head;
        head = newNode;

        // Print Linked List
        insertAtBeg temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
