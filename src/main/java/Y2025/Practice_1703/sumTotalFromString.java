package Y2025.Practice_1703;

public class sumTotalFromString {
    public static void main(String[] args) {
        //Write Java code to get output sum of all numeric digit from a string
        //String input = a1b23c100de1f0
        //Output: 8

        String input = "a1b23c100de1f10";
        int sum =0;
        for(int i=0;i<input.length();i++)
        {
            char ch = input.charAt(i);
            if(ch>='0' && ch<='9')
            {
                sum = sum + Integer.parseInt(String.valueOf(ch));
            }
        }
        System.out.println("Total Sum is: "+sum);

        //Write Java code to get output sum of all numeric from a string
        //String input = a1b23c100de1f0
        //Output: 125
        String input1 = "a1b23c100de1f0";
        int sum1 = getSumOfNumbers(input);
        System.out.println("Output: " + sum1);  // Expected Output: 125
    }
    public static int getSumOfNumbers(String str) {
        int sum = 0;
        String temp = "0";  // Temporary string to store numbers

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                temp += ch;  // Append digit to temp
            } else {
                sum += Integer.parseInt(temp);  // Convert temp to number and add to sum
                temp = "0";  // Reset temp
            }
        }
        sum += Integer.parseInt(temp);  // Add last number if exists
        return sum;
    }
}
