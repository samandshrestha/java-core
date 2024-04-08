package day4session1;

public class D04S16 {
    private int[] queueArray;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public D04S16(int capacity) {
        this.capacity = capacity;
        this.queueArray = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % capacity;
        queueArray[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int item = queueArray[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Elements in circular queue: ");
        int count = 0;
        int index = front;
        while (count < size) {
            System.out.print(queueArray[index] + " ");
            index = (index + 1) % capacity;
            count++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        D04S16 queue = new D04S16(5);
        queue.enqueue(14);
        queue.enqueue(13);
        queue.enqueue(22);
        queue.enqueue(-8);

        queue.display();

        queue.dequeue();
        System.out.println("After removing first element:");
        queue.display();
    }
}
