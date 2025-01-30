package DS.LinkedList.Single;

public class ListTail {
    Node head;
    Node tail;
    int size;

    ListTail(){
        head = null;
        tail = null;
        size = 0;
    }

    public void AddFirst(int data){
        Node node = new Node(data);

        if(head == null){
            head = tail = node;
            size += 1;
            return;
        }
        node.next = head;
        head = node;
        size += 1;
    }

    public void AddLast(int data){
        if(head == null){
            AddFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void Add(int index , int data){
        if(index == 0){
            AddFirst(data);
            return;
        }
        if(index == size){
            AddLast(data);
            return;
        }

        Node node = new Node(data);
        Node current = head;

        for(int i = 1; i < index; i++){
            current = current.next;
        }

        node.next = current.next;
        current.next = node;
        size += 1;
    }

    public void show(){
        Node current = head;
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("End!");
    }
}


