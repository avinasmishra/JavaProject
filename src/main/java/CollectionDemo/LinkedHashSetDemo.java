package CollectionDemo;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        //Declaration of HashSet
        //LinkedHashSet <String> lst = new LinkedHashSet<String>();
        // LinkedHashSet <Integer> lst = new LinkedHashSet<Integer>();
        //LinkedHashSet lst = new LinkedHashSet(100,(float) 0.90); //set capacity 100 and load factor 0.90 manually

        LinkedHashSet hs = new LinkedHashSet(); //default capacity 16 and load factor 0.75

        //adding object/element to linkedhashset
        hs.add(200);
        hs.add("Welcome");
        hs.add(12.23);
        hs.add('A');
        hs.add(true);
        hs.add(null);
        hs.add(200); //wont through error but not added in soutput as well

        System.out.println(hs);

        //remove()
        System.out.println(hs.size());
        System.out.println(hs.remove('A'));
        System.out.println("after removing element:"+hs);

        //contains()
        System.out.println(hs.contains(true)); //true
        System.out.println(hs.contains("asd")); //false
        System.out.println(hs.isEmpty());//false

        //for-loop is not possible
        System.out.println("Using For Each loop");
        for(Object e:hs)
        {
            System.out.println(e);
        }
        System.out.println("Using Iterator loop");
        Iterator it = hs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        LinkedHashSet<Integer> evenNumbers = new LinkedHashSet<Integer>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);

        System.out.println("LinkedHashSet:"+evenNumbers); //[2, 4, 6]

        //addAll()
        LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>();
        numbers.addAll(evenNumbers);
        numbers.add(10);
        System.out.println("New LinkedHashSet:"+numbers); //[2, 4, 6, 10]

        //removeAll()
        numbers.removeAll(evenNumbers);
        System.out.println(numbers); //[10]

        System.out.println("-----ADDITIONAL METHODS-----");
        ///Additional Methods: Union, Intersection, Difference
        //first we have to create 2 set the apply additional methods

        LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        System.out.println("LinkedHashSet 1: "+set1);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
        set2.add(3);
        set2.add(4);
        set2.add(6);
        System.out.println("LinkedHashSet 2: "+set2);

        //NOTE: while checking outcome if we are running either union,intersection or anything comment first which is not required- otherwise outcome not match

        //UNION- use addAll()
       // set1.addAll(set2);
        System.out.println("Union: "+set1); //[1, 2, 3, 4, 6]

        //Intersection- use retainAll()
        set1.retainAll(set2);
        System.out.println("Intersection: "+set1); //[3, 4]

        //difference- use removeAll()
        set1.removeAll(set2);
        System.out.println("Difference: "+set1); //[1, 2]

        //subset- use containsAll()
        System.out.println("Subset: "+set1.containsAll(set2)); //false


    }
}
