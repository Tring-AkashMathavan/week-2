package DS.LinkedList.Single;

public class LinkedList {

    Node head;
    int size;

    LinkedList(){
        this.head = null;
    }

    private Node getNode(Node node){

        Node current = node;

        while(current.next != null){
            current = current.next;
        }
        return current;
    }

    private Node getNode(int index , Node node){
        Node current = node;
        for(int i = 1; i < index; i++){
            current = current.next;
        }
        return current;
    }

    //Insertion
    public void Start(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            size += 1;
            return;
        }
        node.next = head;
        head = node;
        size += 1;
    }

    public void End(int data){
        if(head == null){
            Start(data);
            return;
        }
        Node node = new Node(data);
        Node current = getNode(head);
        current.next = node;
        size += 1;
    }

    public void Middle(int index , int data){
        if(index == 0){
            Start(data);
            return;
        }
        if(index == size){
            End(data);
            return;
        }

        Node node = new Node(data);

        Node current = getNode(index , head);

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

    //Deletion
    public void RemoveStart(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        System.out.println("Remove Element : " + head.data);
        head = head.next;
        size -= 1;
    }

    public void RemoveEnd(){
        if(head == null){
            RemoveStart();
            return;
        }
        Node current = getNode(size - 1 , head);
        System.out.println("Remove Element : " + current.next.data);
        current.next = null;
        size -= 1;
    }

    public void Remove(int index){
        if(index == 0){
            RemoveStart();
            return;
        }
        if(index == size - 1){
            RemoveEnd();
            return;
        }

        Node current = getNode(index , head);
        System.out.println("Remove Element : " + current.next.data);
        current.next = current.next.next;
        size -= 1;
    }

    //Search
    public int search(int target){

        Node current = head;
        int index = 0;

        if(head == null){
            System.out.println("List is Empty!");
            return -1;
        }

        while(current != null){
            if(current.data == target){
                return index;
            }
            current = current.next;
            index += 1;
        }
        return -1;
    }
}

