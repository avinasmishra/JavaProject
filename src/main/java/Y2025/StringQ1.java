package Y2025;

public class StringQ1 {
    public static void main(String[] args) {
        //given string name = "m!y Na@m@e is$   av!in@ash",  expected output "My Name Is Avinash"
        String input = "m!y Na@m@e is$   av!in@ash";

        String finalName2 = Method2(input);
        String finalName1 = Method1(input);

        System.out.println("Final Name Using Method1 is : " +finalName1);
        System.out.println("Final Name Using Method2 is : " +finalName2);

    }
    public static String Method2(String input) {
        StringBuilder fName = new StringBuilder();
        String[] newInput = input.split(" ");
        for (String name : newInput) {
            name = name.replaceAll("[^A-Za-z]", "").trim();
            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(0);
                if (ch >= 'a' || ch <= 'z') {
                    name = name.substring(0, 1).toUpperCase() + name.substring(1);
                }
            }
            fName.append(name).append(" ");
        }
        return fName.toString().replaceAll("\\s+", " ");
    }
    public static String Method1(String input) {
        StringBuilder sb = new StringBuilder();
        String updatedSpace = input.replaceAll("\\s+"," ");
        String[] newInput = updatedSpace.split(" ");
        for (String name : newInput) {
           name = name.replaceAll("[^A-Za-z]", "").trim();
            if (Character.isLowerCase(name.charAt(0))) {
                name = name.substring(0, 1).toUpperCase() + name.substring(1);
            }
            sb.append(name).append(" ");
        }
        return sb.toString().replaceAll("\\s+", " ");
    }

}