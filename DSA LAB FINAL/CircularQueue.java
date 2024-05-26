public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int a) {
        this.capacity = a;
        this.queue = new int[a];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }
    public boolean enqueue(int value) {
        if (isFull()) {
            return false;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        return true;
    }
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        int dequeuedValue = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return dequeuedValue;
    }
    public int front() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue[front];
    }
    public int rear() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue[rear];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue()); // returns 1
        q.enqueue(4);
        System.out.println(q.front()); // returns 2
        System.out.println(q.rear());  // returns 4
    }   
}
