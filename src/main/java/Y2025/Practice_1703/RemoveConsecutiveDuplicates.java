package Y2025.Practice_1703;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String input = "aabbccdeeeaa";
        //output : abcdea
        StringBuilder result = new StringBuilder();

        // Add the first character
        result.append(input.charAt(0));

        for(int i=1;i<input.length();i++)
        {
            if(input.charAt(i) != input.charAt(i-1))
            {
                result.append(input.charAt(i));
            }
        }
        System.out.println("Result : "+result);

    }
}
