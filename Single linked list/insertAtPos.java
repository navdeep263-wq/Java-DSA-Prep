
    import java.util.Scanner;
public class insertAtPos {
    int data;
    insertAtPos next;

    public insertAtPos(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {

        // Hard-coded Linked List
        insertAtPos head = new insertAtPos(2);
        head.next = new insertAtPos(3);
        head.next.next = new insertAtPos(5);
        head.next.next.next = new insertAtPos(6);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        int value = sc.nextInt();

        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        insertAtPos newNode = new insertAtPos(value);

        // Insert at beginning
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
        } else {

            insertAtPos temp = head;

            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;
        }

        // Print Linked List
        insertAtPos ptr = head;

        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }

        sc.close();
    }
}

