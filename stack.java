
class StackLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node top = null;

    // Push element into stack
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;

        System.out.println(data + " pushed into stack.");
    }

    // Pop element from stack
    void pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Popped element: " + top.data);
        top = top.next;
    }

    // View top element
    void peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }

    // Display stack elements
    void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }

        Node temp = top;
        System.out.println("Stack elements:");

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Check whether stack is empty
    boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();
        stack.peek();

        stack.pop();
        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
