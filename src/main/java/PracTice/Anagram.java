package PracTice;

import java.util.HashMap;
import java.util.Set;

public class Anagram {
    public static void main(String[] args)
    {
//        Input: str1 = "Listen"
//        str2 = "Silent"
//        Output: Yes
//        Explanation: A string is called Anagram of other string when the it contains the same characters, only the order of
//        characters can be different.
//         As the occurence of elements are same in both the String hence they are anagram of each other.

        String str1 = "Listen";
        String str2 = "Silent";

        // Function call
        if (areAnagram(str1, str2))
            System.out.print("The two strings are " + "anagram of each other");
        else
            System.out.print("The two strings are "  + "not anagram of each other");
    }

    public static boolean areAnagram(String a, String b)
    {
        // Check if both string has same length or not
        if (a.length() != b.length()) {
            return false;
        }

        // Creating a HashMap containing Character as Key and Integer as Value. We will be storing
        // character as Key and count of character as Value.
        HashMap<Character, Integer> map = new HashMap<>();

        // Loop over all character of first string and put in HashMap.

        for (int i = 0; i < a.length(); i++) {
            // Check if HashMap already contain the current character or not
            char ch = a.charAt(i);
            if (map.containsKey(ch)) {
                // If contains then increase count by 1
                map.put(ch,map.get(ch)+ 1);
            }
            else {
                // else put that character in map and set count to 1 as character is encountered first time
                map.put(ch, 1);
            }
        }

        // Now loop over String b
        for (int i = 0; i < b.length(); i++) {

            // Check if HashMap already contain the current character or not
            char ch = b.charAt(i);
            if (map.containsKey(ch)) {

                // If contains reduce count of that
                // character by 1 to indicate that current
                // character has been already counted as
                // idea here is to check if in last count of
                // all characters in last is zero which
                // means all characters in String a are
                // present in String b.
                map.put(ch,map.get(ch) - 1);

            }
        }

        // Extract all keys of HashMap/map
        Set<Character> keys = map.keySet();

        // Loop over all keys and check if all keys are 0
        // as it means that all the characters are present
        // in equal count in both strings.
        for (Character key : keys) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        // Returning True as all keys are zero
        return true;
    }

}