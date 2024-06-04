package StringConcept;

public class StringDemo1 {
    public static void main(String[] args) {

        //String - is immutable and StringBuffer is mutable

        String s = new String("Avinash");
        s.concat("Mishra");
        System.out.println("String::"+s); //Avinash

        StringBuffer sb = new StringBuffer("Avinash");
        sb.append("Mishra");
        System.out.println("StringBuffer::"+sb); //AvinashMishra

        String s1 = "Kumar";
        s1.concat("Mishra");
        System.out.println("String::"+s1); //Kumar

    }
}
