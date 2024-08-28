class Queue {
    static final int MAX = 1000;
    int front, rear, size;
    int[] arr;

    Queue() {
        front = size = 0;
        rear = MAX - 1;
        arr = new int[MAX];
    }

    boolean isFull() {
        return (size == MAX);
    }

    boolean isEmpty() {
        return (size == 0);
    }

    boolean enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return false;
        } else {
            rear = (rear + 1) % MAX;
            arr[rear] = data;
            size++;
            System.out.println(data + " enqueued to queue");
            return true;
        }
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return 0;
        } else {
            int data = arr[front];
            front = (front + 1) % MAX;
            size--;
            return data;
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return 0;
        } else {
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println("Front element is: " + queue.peek());
    }
}
