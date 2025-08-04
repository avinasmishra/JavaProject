package Y2025.LeetCod;

public class RomanToInteger {

//Q:    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//   Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
//EG: IV - it should be 4 not 15
//    Input: s = "MCMXCIV"
//    Output: 1994
//    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

    public int getValue(char ch)
    {
        switch (ch)
        {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default: return 0;
        }
    }
//    s = "MCMXCIV"
    public int getRomToInt(String s)
    {
        int n = s.length();
        int sum =0;

        for(int i=0;i<n;i++)
        {
            char ch1 = s.charAt(i);

            if((i+1)<n && getValue(ch1) < getValue(s.charAt(i+1)))
            {
                sum = sum-getValue(ch1);   //1000 -100 +1000 -10 + 100 - 1
            }
            else{
                sum = sum + getValue(ch1);   //1000 - 100 + 1000 - 10 + 100 - 1  + 5 = 2005 - 11 = 1994
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String value = "MCMXCIV";
        String value1 = "IV";

        System.out.println("Roman To Integer Value is " + value +" : "+ new RomanToInteger().getRomToInt(value));
        //System.out.println(STR."Roman To Integer Value is \{value1} : \{new RomanToInteger().getRomToInt(value1)}");
    }
}
