package Y2025.Practice_1703;

public class SwapStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("-----------------");

        // Step 1: Concatenate both strings
        str1 = str1 + str2; // "HelloWorld"

        // Step 2: Extract original str1 into str2
        str2 = str1.substring(0, str1.length() - str2.length());

        // Step 3: Extract original str2 into str1
        str1 = str1.substring(str2.length());

        System.out.println("After swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
