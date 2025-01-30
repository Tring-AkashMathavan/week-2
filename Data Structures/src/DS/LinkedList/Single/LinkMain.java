package DS.LinkedList.Single;

public class LinkMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.Middle(0 , 100);
        list.End(200);
        list.End(300);
        list.End(400);
        list.Middle(4,500);
        list.Start(50);
        list.Start(30);
        list.Middle(0 , 10);
        list.show();
        System.out.println(list.size);

        System.out.println(list.search(500));
    }
}
