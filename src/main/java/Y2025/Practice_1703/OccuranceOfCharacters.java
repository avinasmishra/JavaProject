package Y2025.Practice_1703;

import java.util.HashMap;

public class OccuranceOfCharacters {
    public static void main(String[] args) {

        char[]  chars = {'a','c','d','a','d','z'};

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : chars)
        {
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        System.out.println(map);

        for(char key : map.keySet())
        {
            System.out.println(key +" occures "+ map.get(key) + " times.");
        }
        
    }
}
