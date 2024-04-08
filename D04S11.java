package day4session1;

public class D04S11 {
    private static final int MAX_SIZE = 10;
    private String[] stackArray;
    private int top;

    public D04S11() {
        this.stackArray = new String[MAX_SIZE];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    public void push(String item) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
            return;
        }
        stackArray[++top] = item;
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return null;
        }
        return stackArray[top--];
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return stackArray[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Elements of the stack:");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        D04S11 stack = new D04S11();
        stack.push("Hello");
        stack.push("world");
        stack.push("java");
        stack.push("Programming");

        System.out.println("After Pushing 4 Elements:");
        stack.display();

        System.out.println("After a Pop:");
        stack.pop();
        stack.display();
    }
}
