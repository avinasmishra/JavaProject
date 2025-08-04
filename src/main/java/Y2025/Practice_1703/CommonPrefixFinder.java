package Y2025.Practice_1703;

public class CommonPrefixFinder {
    public static void main(String[] args) {
        String[] input = {"flows", "flow", "flo"};
        //output : flo
        System.out.println("Common prefix: " + longestCommonPrefix(input));
    }
    public static String longestCommonPrefix(String[] input)
    {
        if (input == null || input.length == 0){
            return "0";
        }

        String prefix = input[0];

        for (int i = 1; i < input.length; i++) {
            while (!input[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // If no common prefix
                if (prefix.isEmpty()) {
                    return "0";
                }
            }
        }
        return prefix;
    }
}
