package PracTice;

import java.util.HashMap;
import java.util.Map;

public class CountNoOfOccurance {
    public static void main(String[] args) {

        //Example1: string
        String name = "Rama";
        //using map concept
        Map map = new HashMap();

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, (int) map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (Object key : map.keySet()) {
            System.out.println(key + "::" + map.get(key));
        }

        //Example2: int array value
        int[] arr = {1, 5,5, 0, 1,1};
        //count occurance of each value
        CountNoOfOccurance occurance = new CountNoOfOccurance();
        occurance.arrayOccuranceCount(arr);

    }

    public void arrayOccuranceCount(int[] arr)
    {
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < arr.length;i++)
        {
            if(map1.containsKey(arr[i]))
            {
                map1.put(arr[i],map1.get(arr[i])+1);
            }else {
                map1.put(arr[i],1);
            }
        }
        for(int key:map1.keySet())
        {
            System.out.println(key + ":" + map1.get(key));
        }
    }
}