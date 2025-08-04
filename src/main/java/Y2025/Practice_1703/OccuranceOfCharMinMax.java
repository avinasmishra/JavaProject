package Y2025.Practice_1703;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharMinMax {
    public static void main(String[] args) {

        String texts = "Java is a powerful programming";
        texts = texts.toLowerCase().replaceAll("\\s", "");
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<texts.length();i++)
        {
            char charWord = texts.charAt(i);
            if(map.containsKey(charWord))
            {
                map.put(charWord,map.get(charWord)+1);
            }
            else{
                map.put(charWord,1);
            }
        }

        int minFreq = Integer.MAX_VALUE;
        int maxFreq = Integer.MIN_VALUE;
        char minChar = 0, maxChar = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            if (freq < minFreq) {
                minFreq = freq;
                minChar = entry.getKey();
            }
            if (freq > maxFreq) {
                maxFreq = freq;
                maxChar = entry.getKey();
            }
        }
        System.out.println("Character Frequencies: " + map);
        System.out.println("Minimum Occurring Character: '" + minChar + "' = " + minFreq + " times");
        System.out.println("Maximum Occurring Character: '" + maxChar + "' = " + maxFreq + " times");
    }
}
