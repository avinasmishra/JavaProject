package CollectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        //When we go for HashMap:  when we have more number of search operations

        //Map<Integer, String> map = new HashMap<>();
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        //inserting entry into map
        map.put(101, "Ram");
        map.put(102, "Shyam");
        map.put(103, "Mohan");
        map.put(104, "Krishna");
        map.put(105, "Vishnu");
        map.put(103, "Radha");
        map.put(null, "Sita");
        map.put(106, null);
        map.put(107, "Om");

        //wants to print all entry ni console
        System.out.println(map);

        //retrieve value for particular key
        System.out.println(map.get(105));

        //remove value for particular key
        System.out.println(map.remove(107));
        System.out.println(map);

        //if key available
        System.out.println(map.containsKey(102));  //true
        System.out.println(map.containsKey(107));  //false

        //if value present
        System.out.println(map.containsValue("Radha"));// true
        System.out.println(map.containsValue("Om"));  //false

        System.out.println(map.isEmpty());//false
        System.out.println(map.size());

        //wants to retrieve only keys for all entries
        System.out.println(map.keySet());

        //wants to retrieve all value only
        System.out.println(map.values());

        //
        System.out.println(map.entrySet()); // return all entry as set

        //I want to retrieve all values for all key
        System.out.println("Using keySet: "+map.keySet());
        for(Object keyValue:map.keySet())
        {
            System.out.println(keyValue+"   "+map.get(keyValue));
        }

        //Entry Methods
        System.out.println("Using Entry Set: "+map.entrySet());
        for(Map.Entry entry:map.entrySet())
        {
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }

        System.out.println("---------Using iterator---------");
        Set s = map.entrySet();
        Iterator itr = s.iterator();
        while (itr.hasNext())
        {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey()+"   "+entry.getValue());

        }

    }
}
