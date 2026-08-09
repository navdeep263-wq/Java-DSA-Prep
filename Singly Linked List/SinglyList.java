import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node start = null;

    void insert() {

    }

    void atbeg() {

    }

    void atend() {

    }

    void count() {

    }

    void display() {

    }

    void before() {

    }

    void after() {

    }

    void del() {

    }

    void reverse() {

    }

    void edit() {

    }
}

public class SinglyList {

    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();
        Scanner sc = new Scanner(System.in);

        int ch1;
        char choice1 = 'y';

        do {

            System.out.println("\nLINKED LIST PROJECT");
            System.out.println("1. INSERT");
            System.out.println("2. DISPLAY");
            System.out.println("3. DELETE");
            System.out.println("4. EDIT");
            System.out.println("5. COUNT NODES");
            System.out.println("6. SORTING");
            System.out.println("7. REVERSE");
            System.out.println("8. EXIT");

            System.out.print("Enter Your Choice : ");
            ch1 = sc.nextInt();

            switch (ch1) {

                case 1:
                    l1.insert();
                    break;

                case 2:
                    l1.display();
                    break;

                case 3:
                    l1.del();
                    break;

                case 4:
                    l1.edit();
                    break;

                case 5:
                    l1.count();
                    break;

                case 6:
                    System.out.println("Sorting Not Implemented Yet");
                    break;

                case 7:
                    l1.reverse();
                    break;

                case 8:
                    choice1 = 'n';
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice1 == 'y');

        sc.close();
    }
}