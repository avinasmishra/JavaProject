package CollectionDemo;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        //Declaration
        //LinkedList<Integer> l = new LinkedList<Integer>();
        //LinkedList<String> l = new LinkedList<String>();

        LinkedList l = new LinkedList();

        //adding element to linked list
        l.add(100);
        l.add("Welcome");
        l.add('A');
        l.add(12.123);
        l.add(true);
        l.add(null);

        System.out.println(l); //[100, Welcome, A, 12.123, true, null]

        //remove
        l.remove(2);
        System.out.println("after removing: "+l);

        //inserting/adding element in middle
        l.add(3,"Java");
        System.out.println("after adding: "+l);

        //retrieving value
        System.out.println(l.get(3));

        //change the value
        l.set(5,"XY");
        System.out.println("after changing value:"+l);

        //contains()
        System.out.println(l.contains("Java"));//true
        System.out.println(l.isEmpty());//false

        //read all data in element- 3 ways
        //1. for loop
        System.out.println("Reading element using for loop");
        for(int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i));
        }

        // 2. for each loop
        System.out.println("Reading element using forEach loop");
        for(Object all:l)
        {
            System.out.println(all);
        }

        // 3. iterator()
        System.out.println("Reading element using iterator method");
        Iterator it = l.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //sorting element in aarryllist
        LinkedList a1 = new LinkedList();
        //add new element to arraylist
        a1.add("X");
        a1.add("Z");
        a1.add("B");
        a1.add("A");

        System.out.println("Element in linkedlist:"+a1); //[X, Z, B, A]
        Collections.sort(a1);
        System.out.println("Element in linkedlist after sorting::"+a1); //[X, Z, B, A]

        Collections.sort(a1,Collections.reverseOrder());
        System.out.println("Element in linkedlist after sorting in reverse order::"+a1); //[Z, X, B, A]

        //shuffling - collections
        Collections.shuffle(a1);
        System.out.println("Element in linked after shuffling::"+a1); //[

        //convert array to arraylist
        String arr[] = {"Apple", "Ball","Cat","Dog"};
        ArrayList convertToList = new ArrayList(Arrays.asList(arr));
        System.out.println(convertToList);

        //Specific method for LinkedList- Stack and Queue
        LinkedList ll = new LinkedList();

        ll.add("dog");
        ll.add("horse");
        ll.add("cat");
        ll.add("cat");

        System.out.println(ll);//[Apple, ball, cat, cat]
        //adding element to first in list
        ll.addFirst("Tiger");
        //adding element to last in list
        ll.addLast("Elephant");
        System.out.println(ll);

        //get first element in linkedlist
        System.out.println(ll.getFirst());
        //get last element in linkedlist
        System.out.println(ll.getLast());



    }
}
