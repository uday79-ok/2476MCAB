
import java.util.Scanner;
class Node 
	{
    int data;
    Node prev;
    Node next;
    public Node(int data) 
		{
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DoublyLinkedList 
	{
    Node head;
    public DoublyLinkedList() 
		{
        this.head = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public void insertAtPosition(int data, int position) {
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }
        Node newNode = new Node(data);
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }
        Node current = head;
        int count = 1;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newNode.next = current.next;
        newNode.prev = current;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
    }

    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 1) {
            deleteAtBeginning();         
            return;
        }
        Node current = head;
        int count = 1;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }
        if (current == null || current.next == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        current.next = current.next.next;
        if (current.next != null) {
            current.next.prev = current;
        }
    }

    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Doubly Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void sort() {
        if (head == null || head.next == null) {
            return;
        }
        Node current, index;
        int temp;
        for (current = head; current.next != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
            }
        }
    }
    public static DoublyLinkedList merge(DoublyLinkedList list1, DoublyLinkedList list2) {
        if (list1.head == null) {
            return list2;
        }
        if (list2.head == null) {
            return list1;
        }

        DoublyLinkedList mergedList = list1;
        Node current = list1.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = list2.head;
        list2.head.prev = current;
        mergedList.sort();
        return mergedList;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        DoublyLinkedList list2 = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice, data, position;

        do {
            System.out.println("\nDoubly Linked List Operations:");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete at Beginning");
            System.out.println("5. Delete at End");
            System.out.println("6. Delete at Position");
            System.out.println("7. Display");
            System.out.println("8. Sort");
            System.out.println("9. Merge with another list");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    data = scanner.nextInt();
                    list.insertAtBeginning(data);
                    break;
                case 2:
                    System.out.print("Enter data to insert: ");
                    data = scanner.nextInt();
                    list.insertAtEnd(data);
                    break;
                case 3:
                    System.out.print("Enter data to insert: ");
                    data = scanner.nextInt();
                    System.out.print("Enter position: ");
                    position = scanner.nextInt();
                    list.insertAtPosition(data, position);
                    break;
                case 4:
                    list.deleteAtBeginning();
                    break;
                case 5:
                    list.deleteAtEnd();
                    break;
                case 6:
                    System.out.print("Enter position to delete: ");
                    position = scanner.nextInt();
                    list.deleteAtPosition(position);
                    break;
                case 7:
                    list.display();
                    break;
                case 8:
                    list.sort();
                    break;
                case 9:
                    System.out.println("Enter elements for second list (enter -1 to finish):");
                    int val;
                    while((val = scanner.nextInt()) != -1){
                        list2.insertAtEnd(val);
                    }
                    list = merge(list, list2);
                    list2 = new DoublyLinkedList();
                    break;
                case 10:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;                                        
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
        scanner.close();
    }
}  