package DS.Stack;

public class Stack {

    Node head;
    int size;

    Stack(){
        this.head = null;
        this.size = 0;
    }

    private Node getNode(int index , Node node){
        Node current = node;
        for(int i = 1; i < index; i++){
            current = current.next;
        }
        return current;
    }

    public void push(Object value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            size += 1;
            return;
        }

        node.next = head;
        head = node;
        size += 1;
    }

    public Object pop() throws Exception {
        if(head == null){
            throw new Exception("Stack is Empty! You can't get top value");
        }
        Object remove = head.value;
        head = head.next;
        size -= 1;
        return remove;
    }

    public Object peek() throws Exception{
        if(head == null){
            throw new Exception("Stack is Empty! You can't get top value");
        }
        return head.value;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void display(){
        Node current = head;

        while(current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("End!");
    }
}
