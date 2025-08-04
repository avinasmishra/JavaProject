package Y2025.Practice_1703;

public class ReverseString {
    public static void main(String[] args) {

        String name = "mama";
        String result = "";

        for(int i=0;i<name.length();i++)
        {
            char ch = name.charAt(i);
            result = ch + result;
        }
        System.out.println("Reverse String is : "+result);

        if(name.equalsIgnoreCase(result))
        {
            System.out.println(name +" is a pallindrome");
        }
        else {
            System.out.println(name +" is not a pallindrome");
        }

        
    }
}
