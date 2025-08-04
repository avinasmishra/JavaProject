package PracTice;

public class junkExtractionFromString {
    public static void main(String[] args) {

        String junk = "A!! @#1234qwer&*5ASDF";
        //output: I want only number and letter
        String junk1 = junk.replaceAll("[^A-Za-z0-9]","");
        System.out.println("latest::"+junk1);

        //output: I want only alphabets
        String junk2 = junk.replaceAll("[^A-Za-z]","");
        System.out.println("Alphabets::"+junk2);

        //output: I want only digit
        String junk3 = junk1.replaceAll("[^0-9]","");
        System.out.println("Digit::"+junk3);

        //output: I want only special char
        String junk5 = junk.replaceAll("[A-Za-z0-9]","");
        System.out.println("only special char::"+junk5);



    }
}
