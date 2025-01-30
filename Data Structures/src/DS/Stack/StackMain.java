package DS.Stack;

public class StackMain {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());
    }
}
