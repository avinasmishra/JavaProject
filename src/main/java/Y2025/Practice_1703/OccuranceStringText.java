package Y2025.Practice_1703;

import java.util.HashMap;

public class OccuranceStringText {
    public static void main(String[] args) {

        String message="I love My India In India";

        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();

        String[] words = message.split(" ");
        for(String word : words)
        {
            if(map.containsKey(word))
            {
                map.put(word,map.get(word)+1);
            }
            else{
                map.put(word,1);
            }
        }
        System.out.println(map);

        for(String key : map.keySet())
        {
            System.out.println(key +" occures "+ map.get(key) + " times.");
        }


        map1 = getEachCharCount(message);
        System.out.println("map1: "+map1);
        
    }
    public static HashMap<Character, Integer> getEachCharCount(String str)
    {
        char[] chars = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : chars)
        {
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        return map;
    }
}
