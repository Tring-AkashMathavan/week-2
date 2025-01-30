package DS.LinkedList.Double;

public class DoubleList {

    Node head;
    int size;

    DoubleList(){
        this.head = null;
        this.size = 0;
    }

    public Node getNode(Node node){
        Node current = node;
        while(current.next != null){
            current = current.next;
        }
        return current;
    }

    public Node getNode(int index , Node node){
        Node current = node;
        for(int i = 1; i < index; i++){
            current = current.next;
        }
        return current;
    }

    //Insertion
    public void AddFirst(int data){

        Node node = new Node(data);

        if(head == null){
            head = node;
            size += 1;
            return;
        }

        node.next = head;
        head.prev = node;
        head = node;
        size += 1;
    }

    public void AddLast(int data){

        if(head == null){
            AddFirst(data);
            return;
        }

        Node node = new Node(data);
        Node current = getNode(head);
        current.next = node;
        node.prev = current;
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
        Node current = getNode(index , head);

        node.next = current.next;
        current.next.prev = node;
        current.next = node;
        node.prev = current;
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

    //Deletion
    public void DeleteFirst(){

        if(head == null){
            System.out.println("List is Empty!");
            return;
        }

        System.out.println("Remove Element : " + head.data);

        head = head.next;
        head.prev = null;
        size -= 1;
    }

    public void DeleteLast(){

        if(head == null){
            DeleteFirst();
            return;
        }
        Node current = getNode(head);
        System.out.println("Remove Element : " + current.data);
        current.prev.next = null;
        current.prev = null;
        size -= 1;
    }

    public void Delete(int index){
        if(index == 0){
            DeleteFirst();
            return;
        }
        if(index == size){
            DeleteLast();
            return;
        }

        Node previous = getNode(index , head);
        Node current = previous.next;
        System.out.println("Remove Element : " + current.data);
        previous.next = current.next;
        current.next.prev = previous;
        current.next = current.prev = null;
        size -= 1;
    }

}
