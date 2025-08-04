package Y2025.Practice_1703;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters {
    public static void main(String[] args) {

        char[] values = {'c','a','c','a','d','e','c'};

        //create 2 set to store the values
        Set<Character> unique = new HashSet<>();
        Set<Character> duplicate = new HashSet<>();

        for(char ch : values)
        {
            if(!unique.contains(ch))
            {
                unique.add(ch);
            }
            else{
                duplicate.add(ch);
            }
        }
        System.out.println("Unique char : "+ unique);
        System.out.println("Duplicate char : "+ duplicate);

    }
}
