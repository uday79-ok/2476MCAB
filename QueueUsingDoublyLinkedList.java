import java.util.Scanner;
class Node
	{
    int data;
    Node next;
    Node prev;

    public Node(int data)
		{
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class Queue
	{
    public static Node front; 
    public static Node rear;
    public static int size;

    public Queue()
		{
        front = null;
        rear = null;
        size = 0;
    }

   
    public boolean isEmpty() 
		{
        return size == 0;
    }

    public static  void enqueue(int data)
		{
        Node newNode = new Node(data);
        if (rear == null)
			{
            front = newNode;
            rear = newNode;
        } 
		else 
			{
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode; 
        }
        size++;
    }
    public int dequeue()
		{
        if (isEmpty())
			{
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }
        int data = front.data;
        if (front == rear) 
			{
            front = rear = null;
        }
		else
			{
            front = front.next;
            front.prev = null;
        }
        size--;
        System.out.println("Dequeued: " + data);
        return data;
    }
    public void display()
		{
        if (isEmpty()) 
			{
            System.out.println("Queue is empty.");
            return;
        }
        Node current = front;
        System.out.print("Queue:[ ");
        while (current != null) 
			{
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(" ]");
    }
    public int getSize()
		{
        return size;
    }
}

public class QueueUsingDoublyLinkedList  
	{
	
    public static void main(String[] args)
		{
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue();
		System.out.println("enter length of Queue");
		int len=scanner.nextInt();
		System.out.println("enter elements into Queue");
		for (int i=0;i<len ;i++ )
		{
			int val=scanner.nextInt();
			queue.enqueue(val);
		}
        while (true) 
			{
            System.out.println(".........Queue Operations:...........");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Get Size");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) 
				{
                case 1:
                    System.out.println("Enter data to enqueue: ");
                    int enqueueData = scanner.nextInt();
                    queue.enqueue(enqueueData);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.display();
                    break;

                case 4:
                    System.out.println("Queue size: " + queue.getSize());
                    break;

                case 5:
                    System.out.println("Exiting here...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
