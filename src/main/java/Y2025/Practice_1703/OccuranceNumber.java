package Y2025.Practice_1703;

import java.util.HashMap;

public class OccuranceNumber {
    public static void main(String[] args) {

        int[]  numbers = {10,20,40,20,10,100};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<numbers.length;i++)
        {
            if(map.containsKey(numbers[i]))
            {
                map.put(numbers[i],map.get(numbers[i])+1);
            }
            else{
                map.put(numbers[i],1);
            }
        }
        System.out.println(map);

        for(int key : map.keySet())
        {
            System.out.println(key +" occures "+ map.get(key) + " times.");
        }
        
    }
}
