package SubInterview;

public class StringPattern {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            String s = "";
            for (int j = 1; j <= i; j++) {
                s =s+ "*|";
            }
            StringBuffer sb = new StringBuffer(s);
            sb.deleteCharAt(s.length() - 1);
            System.out.println(sb);
        }
    }
}