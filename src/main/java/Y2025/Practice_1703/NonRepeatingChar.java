package Y2025.Practice_1703;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String input = "race car";

        char result = findFirstNonRepeatingChar(input);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
    static char findFirstNonRepeatingChar(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch) && ch!=' ')
            {
                return ch;
            }
        }
        return 0;
    }

}
