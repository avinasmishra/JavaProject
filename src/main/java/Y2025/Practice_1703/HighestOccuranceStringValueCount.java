package Y2025.Practice_1703;

import java.util.HashMap;
import java.util.Map;

public class HighestOccuranceStringValueCount {
    public static void main(String[] args) {

        String message = "avinaaii";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i=0;i<message.length();i++) {
            char ch = message.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (char key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key) + " times.");
        }

        int maxValue = Integer.MIN_VALUE;
        String key ="";
        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + "=> "+entry.getValue());
            if(entry.getValue()>maxValue)
            {
                maxValue = entry.getValue();
                key = String.valueOf(entry.getKey());
            }
        }
        System.out.println("Max Value for key '" + key +"' is : "+maxValue);
    }
}
