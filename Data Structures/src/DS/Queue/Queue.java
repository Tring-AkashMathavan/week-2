package DS.Queue;

public class Queue {

    Node front , rear;
    int size;

    Queue(){
        this.front = this.rear = null;
        this.size = 0;
    }

    public void enqueue(Object value){
        Node node = new Node(value);
        if(rear == null){
            front = rear = node;
            size += 1;
            return;
        }

        rear.next = node;
        rear = node;
        size += 1;
    }

    public Object dequeue(){
        if(front == null){
            return null;
        }

        Object remove = front.value;
        front = front.next;
        size -= 1;
        return remove;
    }

    public Object peek(){
        if(front == null){
            return null;
        }
        return front.value;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public void display(){
        Node current = front;

        while(current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("End!");
    }
}
