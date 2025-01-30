package DS.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        queue.enqueue(400);

        queue.display();

        queue.dequeue();
        queue.dequeue();

        queue.display();

        System.out.println(queue.peek());
        queue.enqueue(500);
        queue.enqueue(600);
        queue.display();
        System.out.println(queue.size);
        System.out.println(queue.peek());
    }
}
