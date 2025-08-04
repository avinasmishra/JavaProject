package Y2025.Practice_1703;

public class WordLengthFinderShortLong {
    public static void main(String[] args) {
        String input = "Automation testing is improve   software quality";

        String[] words = input.split("\\s+"); // Split string by whitespace

        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Shortest word: " + shortest);
        System.out.println("Longest word: " + longest);
    }
}
