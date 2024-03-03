package CollectionDemo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {

        //In PriorityQueue(c) - hetrogeneous data is not allowed
        PriorityQueue queue = new PriorityQueue();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.offer("C");

        System.out.println(queue); //insertion order is preserved & duplicate allowed

        //get head of the element- element()  peek()
        System.out.println(queue.element()); //A returns head element, if queue empty return NoSuchElementException
        System.out.println(queue.peek()); ////A returns head element, if queue empty return null

        //return & remove element from queue - remove() poll()
        System.out.println(queue.remove());
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        Iterator it = queue.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //another way
        for (Object q:queue)
        {
            System.out.println(q);
        }



    }
}
