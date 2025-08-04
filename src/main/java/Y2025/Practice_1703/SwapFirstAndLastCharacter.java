package Y2025.Practice_1703;

public class SwapFirstAndLastCharacter {
    public static void main(String[] args) {
//        Write Java code to swap first and last character of string
//        String input: Avinash Mishra
//        Output: hvinasA aishrM

        String input= "Avinash Mishra";
        String output =  swapFirstAndLastChr(input);
        System.out.println("Output : "+output);

    }
    public static String swapFirstAndLastChr(String str)
    {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word : words)
        {
            if(word.length()>1)
            {
                //Swap first and last character
               char first = word.charAt(0);
               char last = word.charAt(word.length()-1);
               String middle = word.substring(1,word.length()-1);
               result.append(last).append(middle).append(first).append(" ");
            }
            else {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim(); //Remove trailing space and return result
    }
}
