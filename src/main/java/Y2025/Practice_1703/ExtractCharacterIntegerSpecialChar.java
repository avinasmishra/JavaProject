package Y2025.Practice_1703;

import java.util.HashMap;

public class ExtractCharacterIntegerSpecialChar {
    public static void main(String[] args) {

        String str = "1234jhydo456*&%#jk3AW45z*1";
        String temp ="";
        String temp1 ="";
        String temp2 ="";

        //Approach 1: using loop
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            {
                temp = temp + ch;
            } else if (ch>='0' && ch<='9')
            {
                temp1 += ch;
            }
            else {
                temp2 += ch;
            }
        }
        System.out.println("Alphabets are: "+temp);
        System.out.println("Numbers are: "+temp1);
        System.out.println("Special char are: "+temp2);

        //Approach 2: using replaceAll

        String alphabets = str.replaceAll("[^A-Za-z]","");
        String numbers = str.replaceAll("[^0-9]","");
        String specialChars = str.replaceAll("[A-Za-z0-9]","");

        System.out.println("----------------- ");
        System.out.println("Alphabets are: "+alphabets);
        System.out.println("Numbers are: "+numbers);
        System.out.println("Special char are: "+specialChars);

    }
}
