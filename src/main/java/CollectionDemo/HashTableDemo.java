package CollectionDemo;

import java.util.*;

public class HashTableDemo {
    public static void main(String[] args) {

        //Map<Integer, String> map = new Hashtable<>();
        Hashtable<Integer, String> table = new Hashtable<Integer, String>();

        //inserting entry into map
        table.put(101, "Ram");
        table.put(102, "Shyam");
        table.put(103, "Mohan");
        table.put(104, "Krishna");
        table.put(105, "Vishnu");
        table.put(103, "Radha");
        //table.put(null, "Sita");  //error- NullPointerException
       // table.put(106, null);  //error- NullPointerException
        table.put(107, "Om");

        //wants to print all entry ni console
        System.out.println(table);

        //retrieve value for particular key
        System.out.println(table.get(105));

        //remove value for particular key
        System.out.println(table.remove(107));
        System.out.println(table);

        //if key available
        System.out.println(table.containsKey(102));  //true
        System.out.println(table.containsKey(107));  //false

        //if value present
        System.out.println(table.containsValue("Radha"));// true
        System.out.println(table.containsValue("Om"));  //false

        System.out.println(table.isEmpty());//false
        System.out.println(table.size());

        //wants to retrieve only keys for all entries
        System.out.println(table.keySet());

        //wants to retrieve all value only
        System.out.println(table.values());

        System.out.println(table.entrySet()); // return all entry as set

        //I want to retrieve all values for all key
        System.out.println("Using keySet: "+table.keySet());
        for(Object keyValue:table.keySet())
        {
            System.out.println(keyValue+"   "+table.get(keyValue));
        }

        //Entry Methods
        System.out.println("Using Entry Set: "+table.entrySet());
        for(Map.Entry entry:table.entrySet())
        {
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }

        System.out.println("---------Using iterator---------");
        Set s = table.entrySet();
        Iterator itr = s.iterator();
        while (itr.hasNext())
        {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey()+"   "+entry.getValue());

        }

    }
}
