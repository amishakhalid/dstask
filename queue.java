
class QueueLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node front = null;
    Node rear = null;

    // Insert element into queue
    void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(data + " inserted into queue.");
    }

    // Remove element from queue
    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Removed element: " + front.data);
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    // Display front element
    void peek() {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element: " + front.data);
        }
    }

    // Display all elements
    void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node temp = front;
        System.out.println("Queue elements:");

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Check whether queue is empty
    boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();
        queue.peek();

        queue.dequeue();
        queue.display();

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
