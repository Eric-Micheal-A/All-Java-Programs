import java.util.*;
public class Dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> q=new ArrayDeque<Integer>();
        q.add(20);
        q.addFirst(40);
        q.addLast(60);
        q.addFirst(80);
        q.add(100);
        q.addFirst(120);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.peekFirst());
        System.out.println(q.peekLast());
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q.removeFirst());
        System.out.println(q);
        System.out.println(q.removeLast());
        System.out.println(q);



    }
}
