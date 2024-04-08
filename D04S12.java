package day4session1;

class Node {
    double data;
    Node next;

    Node(double data) {
        this.data = data;
        this.next = null;
    }
}

public class D04S12 {
    private Node top;

    public D04S12() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public double pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return Double.NaN; 
        }
        double popped = top.data;
        top = top.next;
        return popped;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            return;
        }
        Node current = top;
        System.out.print("The elements of the stack are: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        D04S12 stack = new D04S12();
        stack.push(10.0);
        stack.push(20.0);
        stack.push(30.0);
        stack.push(40.0);

        stack.display();

        double popped1 = stack.pop();
        double popped2 = stack.pop();

        System.out.println("After popping twice:");
        stack.display();
    }
}

