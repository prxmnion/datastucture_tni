public class StackTest {

    public static void main(String[] args) {

        StackLinkedList num_stack = new StackLinkedList();

        num_stack.push(15);
        num_stack.push(16);
        num_stack.push(17);

        System.out.println("Pop stack = " + num_stack.pop());
        System.out.println("Pop stack = " + num_stack.pop());

//      System.out.println("Pop stack = " + num_stack.pop());
//      System.out.println("Peek stack = " + num_stack.peek());
//      System.out.println("Pop stack = " + num_stack.pop());
//      System.out.println("Peek stack = " + num_stack.peek());
//      System.out.println("Pop stack = " + num_stack.pop());
//      System.out.println("Peek stack = " + num_stack.peek());

    }
}
