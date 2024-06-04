package StringConcept;

public class StringDemo2 {
    public static void main(String[] args) {

        //String - is immutable and StringBuffer is mutable
        //== operator checking reference/address comparison for both String and StringBuffer class
        //.equals() methods: for String it checks content comparison BUT for StringBuffer it check reference/address comparison

        String s1 = new String("Avinash");
        String s2 = new String("Avinash");
        System.out.println("==Operator::"+s1==s2);
        System.out.println(".equals Operator::"+s1.equals(s2));

        StringBuffer sb1 = new StringBuffer("Avinash");
        StringBuffer sb2 = new StringBuffer("Avinash");
        System.out.println(sb1==sb2);
        System.out.println(".equals() Operator SB::"+sb1.equals(sb2));

        //Another example
        String s=new String("Spring");
        s.concat("Fall");
        String s3=s.concat("Winter");
        s3.concat("Summer");
        System.out.println("S::"+s);
        System.out.println("S3::"+s3);

    }
}
