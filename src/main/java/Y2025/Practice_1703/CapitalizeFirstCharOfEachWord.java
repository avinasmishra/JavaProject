package Y2025.Practice_1703;

public class CapitalizeFirstCharOfEachWord {
    public static void main(String[] args) {
//        Write Java code to swap first and last character of string
//        String input: avinash kumar  Mishra
//        Output: Avinash Kumar Mishra

        String input= "avinash kumar  Mishra";
        String output =  capitalizeFirstLetterOfEachWord(input);
        System.out.println("Output : "+output);

    }
    public static String capitalizeFirstLetterOfEachWord(String str)
    {
        str = str.replaceAll("\\s+"," ");
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word : words)
        {
            char first = word.trim().charAt(0);
            if(first>='a' && first<='z')
            {
                String upper = String.valueOf(first).toUpperCase();
                word = upper + word.substring(1);
//                word = word.substring(0,1).toUpperCase() + word.substring(1);
            }
            result.append(word).append(" ");
        }
        return result.toString().trim();
    }
}
