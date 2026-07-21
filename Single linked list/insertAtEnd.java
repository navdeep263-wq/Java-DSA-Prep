// import java.util.Scanner;

// public class insertAtEnd {

//     int data;
//     insertAtEnd next;

//     public insertAtEnd(int data) {
//         this.data = data;
//         this.next = null;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         // Hard-coded Linked List
//         insertAtEnd head = new insertAtEnd(2);
//         head.next = new insertAtEnd(3);
//         head.next.next = new insertAtEnd(4);
//         head.next.next.next = new insertAtEnd(5);

//         // User se value lena
//         System.out.print("Enter value: ");
//         int value = sc.nextInt();

//         // New node
//         insertAtEnd newNode = new insertAtEnd(value);

//         // Agar list empty hai
//         if (head == null){
//             head = newNode;
//         }
//         else {

//             insertAtEnd temp = head;

//             while (temp.next != null) {
//                 temp = temp.next;
//             }

//             temp.next = newNode;
//         }

//         // Print Linked List
//         System.out.println("Linked List:");

//         insertAtEnd temp = head;

//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }

//         sc.close();
//     }
// }
import java.util.Scanner;

public class insertAtEnd {

    int data;
    insertAtEnd next;

    public insertAtEnd(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        insertAtEnd head = null;

        // Linked List banana
        for (int i = 1; i <= n; i++) {

            System.out.print("Enter data: ");
            int value = sc.nextInt();

            insertAtEnd newNode = new insertAtEnd(value);

            if (head == null) {
                head = newNode;
            } else {

                insertAtEnd temp = head;

                while (temp.next != null) {
                    temp = temp.next;
                }

                temp.next = newNode;
            }
        }

        // End mein insert karna
        System.out.print("Enter value to insert at end: ");
        int x = sc.nextInt();

        insertAtEnd newNode = new insertAtEnd(x);

        if (head == null) {
            head = newNode;
        } else {

            insertAtEnd temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        // Print Linked List
        System.out.println("Linked List:");

        insertAtEnd temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        sc.close();
    }
}