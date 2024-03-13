// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       /* Stack stack=new Stack(5);
        stack.push(25);
        stack.push(26);
       stack.push(27);
        stack.push(28);
        stack.push(29);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.pop());
        */
     /*   Queue queue=new Queue(7);
        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
        queue.enqueue(15);
        queue.enqueue(16);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();*/
      /*  Stack stack = new Stack();

        System.out.println("Size is: "	+stack.size());

        stack.push(5);
        stack.push(10);
        stack.push(50);
        stack.print();
        System.out.println("Size is: "	+stack.size());

        stack.pop();
        stack.print();
        System.out.println("Size is: "	+stack.size());*/
        Queue queue = new Queue();

        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.print();
        queue.dequeue();
        queue.dequeue();
        queue.print();
        queue.enqueue(20);
        queue.enqueue(40);
        queue.print();



    }
}