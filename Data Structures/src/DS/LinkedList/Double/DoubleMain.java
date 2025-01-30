package DS.LinkedList.Double;

public class DoubleMain {
    public static void main(String[] args) {
        DoubleList list = new DoubleList();

        list.AddFirst(100);
        list.AddFirst(50);
        list.AddFirst(30);
        list.AddFirst(20);
        list.AddLast(200);
        list.AddLast(400);
        list.AddLast(500);
        list.show();
        System.out.println(list.size);

        list.DeleteFirst();
        list.DeleteFirst();
        list.show();
        System.out.println(list.size);

        list.DeleteLast();
        list.DeleteLast();
        list.show();
        System.out.println(list.size);

        list.Delete(0);
        list.show();
    }
}
