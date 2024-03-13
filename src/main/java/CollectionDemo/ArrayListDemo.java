package CollectionDemo;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        //declaration of arraylist
       /* ArrayList al = new ArrayList();
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        ArrayList<String> al2 = new ArrayList<String>();
        List li = new ArrayList();  */

        ArrayList al = new ArrayList();

        //add new element to arraylist
        al.add(100);
        al.add("Welcome");
        al.add(15.54);
        al.add('A');
        al.add(true);

        System.out.println(al); //[100, Welcome, 15.54, A, true]

        //total size of element
        System.out.println(al.size());

        //remove element both will do same thing
        al.remove(1);  //[100, 15.54, A, true]
        al.remove("Welcome");  //[100, 15.54, A, true]
        System.out.println(al);

        //want to add element in somewhere middle
        al.add(2, "Hi");
        System.out.println(al);  //[100, 15.54, Hi, A, true]

        //retrieve element
        System.out.println(al.get(2));

        //set new value at any index
        al.set(2, "C#");
        System.out.println(al); //[100, 15.54, C#, A, true]

        //searching element is present or not
        System.out.println(al.contains("C#"));
        System.out.println(al.isEmpty());

        //read all data in element- 3 ways
        //1. for loop
        System.out.println("Reading element using for loop");
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        // 2. for each loop
        System.out.println("Reading element using forEach loop");
        for(Object all:al)
        {
            System.out.println(all);
        }

        // 3. iterator()
        System.out.println("Reading element using iterator method");
        Iterator it = al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //sorting element in aarryllist
        ArrayList a1 = new ArrayList();
        //add new element to arraylist
        a1.add("X");
        a1.add("Z");
        a1.add("B");
        a1.add("A");

        System.out.println("Element in arraylist:"+a1); //[X, Z, B, A]
        Collections.sort(a1);
        System.out.println("Element in arraylist after sorting::"+a1); //[A, B, X, Z]

        Collections.sort(a1,Collections.reverseOrder());
        System.out.println("Element in arraylist after sorting in reverse order::"+a1); //[Z, X, B, A]

        //shuffling - collections
        Collections.shuffle(a1);
        System.out.println("Element in arraylist after shuffling::"+a1);

        //convert array to arraylist
        String arr[] = {"Apple", "Ball","Cat","Dog"};
        ArrayList convertToList = new ArrayList(Arrays.asList(arr));
        System.out.println(convertToList);

    }
}
